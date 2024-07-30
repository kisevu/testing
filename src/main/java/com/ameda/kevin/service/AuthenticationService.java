package com.ameda.kevin.service;

/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.entity.User;
import com.ameda.kevin.repository.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class AuthenticationService {

    private UserRepository repository;

    public AuthenticationService(UserRepository repository) {
        this.repository = repository;
    }
    public boolean authenticate(String username, String password){
        User user = repository.findByUserName(username);
        return user.getPassword().equals(password);
    }

    public Set<User> getRegularUsers(){
        return  repository.findAll().stream()
                .filter(user -> user.isLive() && user.getUserType() == User.UserType.REGULAR_USER)
                .collect(Collectors.toSet());
    }
}
