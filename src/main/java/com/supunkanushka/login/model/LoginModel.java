package com.supunkanushka.login.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginModel {
    @NonNull
    private String userName;
    @NonNull
    private String password;
}
