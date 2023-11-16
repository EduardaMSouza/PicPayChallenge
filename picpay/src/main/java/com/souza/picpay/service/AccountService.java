package com.souza.picpay.service;

import com.souza.picpay.data.AccountRepository;
import com.souza.picpay.domain.AccountModel;
import com.souza.picpay.dto.account.AccountRequestDto;
import com.souza.picpay.dto.account.AccountResponseDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;

    private ModelMapper modelMapper;

    public AccountResponseDto saveAccount(String userUuid) {
        var account = new AccountModel(null ,userUuid, new BigDecimal(0));
        var savedAccount = accountRepository.save(account);
        return modelMapper.map(savedAccount, AccountResponseDto.class);
    }

    public BigDecimal getAccountBalance(String uuid) {
        var account = accountRepository.findByUuid(uuid);
        return account.getBankBalance();
    }

    @Transactional
    public void saveUpdatedBalance(String payerUuid, String payeeUuid, BigDecimal value) {
        var payerAccount = accountRepository.findByUuid(payerUuid);
        var payeeAccount = accountRepository.findByUuid(payeeUuid);
        payerAccount.payerUpdate(value);
        payeeAccount.payeeUpdate(value);
        accountRepository.save(payerAccount);
        accountRepository.save(payeeAccount);
    }

}
