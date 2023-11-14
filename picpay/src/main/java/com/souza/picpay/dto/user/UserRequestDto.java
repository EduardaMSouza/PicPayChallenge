package com.souza.picpay.dto.user;

import com.souza.picpay.domain.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private String cpf;
    private String email;
    private String password;
    private RoleEnum role;
}
