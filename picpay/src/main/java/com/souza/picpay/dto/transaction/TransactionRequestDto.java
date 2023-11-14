package com.souza.picpay.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionRequestDto {
    private String payerAccountUuid;
    private  String payeeAccountUuid;
}
