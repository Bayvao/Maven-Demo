package com.maven.demo;

public class UserController {

    public User newUser(UserCommand userCommand){

        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}
