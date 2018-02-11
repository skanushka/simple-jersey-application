package com.supunkanushka.login.resource;

import com.supunkanushka.login.dao.LoginDao;
import com.supunkanushka.login.model.LoginModel;
import com.supunkanushka.user.dao.UserDao;
import com.supunkanushka.user.model.UserModel;
import lombok.NonNull;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("login")
public class SignInResource {

    private final LoginDao loginDao = new LoginDao();
    private final UserDao userDao = new UserDao();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public UserModel signIn(@NonNull LoginModel loginModel) {
        UserModel user = new UserModel();
        if (loginDao.authenticateLogin(loginModel.getUserName(), loginModel.getPassword())) {
            user = userDao.getAllUsers()
                    .stream()
                    .filter(userModel -> userModel.getUserName().equals(loginModel.getUserName()))
                    .findFirst()
                    .get();
        }
        return user;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<LoginModel> getLogins() {
        return loginDao.getAllLogins();
    }
}
