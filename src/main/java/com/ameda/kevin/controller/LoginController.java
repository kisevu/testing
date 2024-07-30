package com.ameda.kevin.controller;

/*
*
@author ameda
@project testing
*
*/

import com.ameda.kevin.service.AuthenticationService;

public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String service(String username, String password){
        return authenticationService.authenticate(username,password) ? "/home" : "/login";
    }
}
