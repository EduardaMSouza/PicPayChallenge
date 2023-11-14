package com.souza.picpay.controller.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionResponseDto {
    private String uuid;
    private String payerAccountUuid;
    private  String payeeAccountUuid;
}
