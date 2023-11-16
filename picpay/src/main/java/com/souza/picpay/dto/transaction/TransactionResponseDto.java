package com.souza.picpay.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionResponseDto {
    private String uuid;
    private String payerAccountUuid;
    private String payeeAccountUuid;
    private BigDecimal value;
}
