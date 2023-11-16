package com.souza.picpay.controller;


import com.souza.picpay.dto.user.UserRequestDto;
import com.souza.picpay.dto.user.UserResponseDto;
import com.souza.picpay.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> login(@RequestBody UserRequestDto dto) {
        var savedUser = userService.saveUser(dto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
