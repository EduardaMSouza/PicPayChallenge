package com.souza.picpay.data;

import com.souza.picpay.domain.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AccountRepository extends JpaRepository<AccountModel, String> {

    AccountModel findByUuid(String uuid);
}
