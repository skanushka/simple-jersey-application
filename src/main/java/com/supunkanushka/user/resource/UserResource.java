package com.supunkanushka.user.resource;

import com.supunkanushka.user.dao.UserDao;
import com.supunkanushka.user.model.UserModel;
import lombok.NonNull;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserResource {

    @NonNull
    private final UserDao userDao = new UserDao();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @NonNull
    public List<UserModel> getAllUsers() {
        return userDao.getAllUsers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser(@NonNull UserModel userModel){
        userDao.addUser(userModel);
    }

}
