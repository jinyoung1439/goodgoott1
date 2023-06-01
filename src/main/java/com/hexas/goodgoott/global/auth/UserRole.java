package com.hexas.goodgoott.global.auth;

import com.hexas.goodgoott.user.dto.UserDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value){
        this.value = value;
    }

    private  String value;
}
