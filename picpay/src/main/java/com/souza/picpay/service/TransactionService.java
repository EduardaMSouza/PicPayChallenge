package com.souza.picpay.service;

import com.souza.picpay.data.TransactionRepository;
import com.souza.picpay.domain.TransactionModel;
import com.souza.picpay.domain.TransactionStatus;
import com.souza.picpay.dto.transaction.TransactionRequestDto;
import com.souza.picpay.dto.transaction.TransactionResponseDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;

@Service
@AllArgsConstructor

public class TransactionService {

    private TransactionRepository transactionRepository;

    private ModelMapper modelMapper;

    private AccountService accountService;

    private WebClient webClient;


    @Transactional
    public TransactionResponseDto saveTransaction(TransactionRequestDto dto) {
        checkTransactionStatus();
        modelMapperConfig();
        var payerBalance = accountService.getAccountBalance(dto.getPayerAccountUuid());
        checkBalance(payerBalance, dto.getValue());
        var transaction = modelMapper.map(dto, TransactionModel.class);
        var savedTransaction = transactionRepository.save(transaction);
        accountService.saveUpdatedBalance(dto.getPayerAccountUuid(), dto.getPayeeAccountUuid(), dto.getValue());
        return modelMapper.map(savedTransaction, TransactionResponseDto.class);
    }

    public void checkBalance(BigDecimal payerBalance,BigDecimal value) {
        if(payerBalance.compareTo(value) < 0  ) {
            throw new RuntimeException("Insufficient balance");
        }
    }

    public void modelMapperConfig() {
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public void checkTransactionStatus() {
        var status = webClient.get().uri("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc").retrieve().bodyToMono(TransactionStatus.class).block();
        if (!status.getMessage().equals("Autorizado")) {
            throw new RuntimeException("service not available");
        }
    }

}
