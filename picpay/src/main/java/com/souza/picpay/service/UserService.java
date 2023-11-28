package com.souza.picpay.service;

import com.souza.picpay.data.UserRepository;
import com.souza.picpay.domain.UserModel;
import com.souza.picpay.dto.user.UserRequestDto;
import com.souza.picpay.dto.user.UserResponseDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    private AccountService accountService;

    private ModelMapper modelMapper;

    public UserResponseDto saveUser(UserRequestDto dto) {
        var user = modelMapper.map(dto, UserModel.class);
        var encryptedPassword = new BCryptPasswordEncoder().encode(dto.getPassword());
        user.setPassword(encryptedPassword);
        var savedUser = userRepository.save(user);
        var account = accountService.saveAccount(savedUser.getUuid());
        var joinAccount = modelMapper.map(savedUser, UserResponseDto.class);
        joinAccount.setAccount(account);
        return joinAccount;
    }

}
