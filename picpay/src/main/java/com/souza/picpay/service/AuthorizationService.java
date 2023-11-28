package com.souza.picpay.service;

import com.souza.picpay.data.UserRepository;
import com.souza.picpay.dto.user.LoginResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorizationService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username);
    }

    public LoginResponseDto login(UsernamePasswordAuthenticationToken usernamePassword) {
        return new LoginResponseDto(usernamePassword.toString());
    }
}
