package com.supunkanushka.user.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserModel {
    private int userId;
    @NonNull
    private String userName;
}
