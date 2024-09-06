package dev.brigido.controller;

import dev.brigido.entity.UserEntity;
import dev.brigido.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.hibernate.query.Page;

import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class UserController
{
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Transactional
    public Response createUser(UserEntity userEntity){

        return Response.ok(userService.createUser(userEntity)).build();
    }

    @GET
    public List<UserEntity> findALl(){

    }
}
