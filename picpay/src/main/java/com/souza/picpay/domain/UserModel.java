package com.souza.picpay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    private String firstName;
    private String lastName;
    private String cpf;
    private String email;
    private String password;
    private RoleEnum role;

}
