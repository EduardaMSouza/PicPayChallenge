package com.souza.picpay.controller;

import com.souza.picpay.dto.transaction.TransactionRequestDto;
import com.souza.picpay.dto.transaction.TransactionResponseDto;
import com.souza.picpay.service.TransactionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionController {

    private TransactionService transactionService;

    @PostMapping
    @Transactional
    public ResponseEntity<TransactionResponseDto> saveTransaction(@RequestBody TransactionRequestDto dto) {
        var savedTransaction = transactionService.saveTransaction(dto);
        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }

}
