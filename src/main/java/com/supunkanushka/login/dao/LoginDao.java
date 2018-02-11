package com.supunkanushka.login.dao;

import com.supunkanushka.login.model.LoginModel;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class LoginDao {

    private static final List<LoginModel> loginModels = new ArrayList<>();

    public LoginDao() {
        LoginModel loginModel = new LoginModel();
        loginModel.setUserName("user");
        loginModel.setPassword("password");
        loginModels.add(loginModel);
    }

    public boolean authenticateLogin(@NonNull final String userName, @NonNull String password) {
        return loginModels
                .stream()
                .anyMatch(loginModel -> loginModel.getUserName().equals(userName)
                        && loginModel.getPassword().equals(password));
    }

    @NonNull
    public List<LoginModel> getAllLogins() {
        return loginModels;
    }

}
