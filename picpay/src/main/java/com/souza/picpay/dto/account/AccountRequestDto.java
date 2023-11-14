package com.souza.picpay.dto.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountRequestDto {
    private String userUuid;
    private BigDecimal bankBalance;
}
