package com.souza.picpay.data;

import com.souza.picpay.domain.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountModel, String> {
}
