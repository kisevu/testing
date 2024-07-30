package com.ameda.kevin.repository;

/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.entity.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<>();

    public UserRepository() {
        //regular users
        users.put("Peninah",User.createRegularUser("Peninah","muiruri"));
        users.put("Paul",User.createRegularUser("Paul","muiruri"));
        //admin users
        users.put("judith",User.createAdminUser("judith","mongare"));
        users.put("kevin",User.createAdminUser("kevin","ameda"));
    }

    public User findByUserName(String username){
     return  users.get(username);
    }

    public List<User> findAll(){
        return new LinkedList<>(users.values());
    }

}
