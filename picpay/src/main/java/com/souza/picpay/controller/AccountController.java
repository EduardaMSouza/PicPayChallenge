package com.souza.picpay.controller;

import com.souza.picpay.domain.AccountModel;
import com.souza.picpay.dto.account.AccountRequestDto;
import com.souza.picpay.dto.account.AccountResponseDto;
import com.souza.picpay.service.AccountService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;



}
