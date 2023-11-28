package com.souza.picpay.domain;

import lombok.Getter;

@Getter
public enum RoleEnum {
    RETAILER("retailer"),
    USER("user");

    private String role;

    RoleEnum(String role) {
        this.role = role;
    }

}
