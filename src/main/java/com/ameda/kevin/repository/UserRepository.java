package com.ameda.kevin.repository;

/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("kevin", new User("kevin","ameda"));
        users.put("judith",new User("judith","mongare"));
    }

    public User findByUserName(String username){
     return  users.get(username);
    }
}
