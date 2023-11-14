package com.souza.picpay.data;

import com.souza.picpay.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, String> {
}
