package com.ameda.kevin.service;

/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.entity.User;
import com.ameda.kevin.repository.UserRepository;

public class AuthenticationService {

    private UserRepository repository;

    public boolean authenticate(String username, String password){
        User user = repository.findByUserName(username);
        return user.getPassword().equals(password);
    }
}
