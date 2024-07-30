package com.ameda.kevin.service;

import com.ameda.kevin.entity.User;
import com.ameda.kevin.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/*
@author{author}
*/
public class AuthenticationServiceTest{

    private AuthenticationService service;
    private UserRepository repository;

    @Before
    public void setUp(){
        this.repository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(repository);
    }

    @Test
    public void testAuthenticate_user_for_login() {
        //Arrange
        Mockito.when(this.repository.
                findByUserName("oscar")).thenReturn(User.createRegularUser("oscar","kisala"));
        //Act
       boolean result =  this.service.authenticate("oscar","kisala");
        //Assert
        Assert.assertEquals(true,result);
    }
}