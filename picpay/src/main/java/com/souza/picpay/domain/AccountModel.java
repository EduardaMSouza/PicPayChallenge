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
@Table(name = "accounts")
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    @Column(name = "user_uuid")
    private String userUuid;
    @Column(name = "bank_balance")

    private BigDecimal bankBalance;

    public void payerUpdate(BigDecimal value) {
        this.setBankBalance(this.bankBalance.subtract(value));
    }

    public void payeeUpdate(BigDecimal value) {
        this.setBankBalance(this.bankBalance.add(value));
    }
}
