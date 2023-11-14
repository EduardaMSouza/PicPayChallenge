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
@Table
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    private String userUuid;
    private BigDecimal bankBalance;
}
