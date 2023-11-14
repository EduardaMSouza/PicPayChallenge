package com.souza.picpay.data;

import com.souza.picpay.domain.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, String> {
}
