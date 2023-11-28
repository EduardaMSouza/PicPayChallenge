package com.souza.picpay.data;

import com.souza.picpay.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, String> {
    UserDetails findByEmail(String email);
}
