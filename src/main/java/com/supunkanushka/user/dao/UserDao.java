package com.supunkanushka.user.dao;

import com.supunkanushka.user.model.UserModel;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final List<UserModel> userModels = new ArrayList<>();

    public void addUser(@NonNull UserModel userModel) {
        userModels.add(userModel);
    }

    @NonNull
    public List<UserModel> getAllUsers() {
        return userModels;
    }

}
