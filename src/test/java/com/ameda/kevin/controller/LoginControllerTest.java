package com.ameda.kevin.controller;


import com.ameda.kevin.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;

/*
@author{author}
*/
public class LoginControllerTest{


    private LoginController loginController;
    private AuthenticationService service;

    @Before
    public void setUp(){
        this.service = Mockito.mock(AuthenticationService.class);
        this.loginController = new LoginController(this.service);
    }

    @Ignore
    @Test
    public void  testService_valid_usernameAndPassword_logsIn_user(){
        //Arrange
        Mockito.when(this.service.authenticate(anyString(),anyString()))
                .thenReturn(true);
        //Act
        String viewPath = this.loginController.service("kekeje","keekehe");
        //Assert
        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home",viewPath);
    }
}