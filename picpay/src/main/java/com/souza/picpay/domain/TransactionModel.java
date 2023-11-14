package com.souza.picpay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class TransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    private String payerAccountUuid;
    private  String payeeAccountUuid;
}
