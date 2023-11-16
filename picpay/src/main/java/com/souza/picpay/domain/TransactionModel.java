package com.souza.picpay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "transactions")
public class TransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    @Column(name = "payer_account_uuid")
    private String payerAccountUuid;
    @Column(name = "payee_account_uuid")
    private  String payeeAccountUuid;
    private BigDecimal value;
}
