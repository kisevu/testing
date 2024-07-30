package com.ameda.kevin.service;/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.entity.User;
import com.ameda.kevin.repository.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public Set<User> getRegularUsers(){
        return  findUserByUserType(User.UserType.REGULAR_USER);
    }

    public Set<User> getAdminUsers(){
        return findUserByUserType(User.UserType.ADMIN_USER);
    }

    private Set<User> findUserByUserType(User.UserType userType){
        return  repository.findAll().stream()
                .filter(user -> user.isLive() && user.getUserType() == userType)
                .collect(Collectors.toSet());
    }
}
