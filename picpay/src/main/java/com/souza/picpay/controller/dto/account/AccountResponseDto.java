package com.souza.picpay.controller.dto.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountResponseDto {
    private String uuid;
    private String userUuid;
    private BigDecimal bankBalance;
}
