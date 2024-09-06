package dev.brigido.service;

import dev.brigido.entity.UserEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity){
        UserEntity.persist(userEntity);
        return userEntity;
    }
}
