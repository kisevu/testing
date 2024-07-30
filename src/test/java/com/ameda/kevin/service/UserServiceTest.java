package com.ameda.kevin.service;

import com.ameda.kevin.entity.User;
import com.ameda.kevin.repository.UserRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService userService;

    @Test
    public void getRegularUsers() {
        /* arrange */
        List<User> users = new ArrayList<>();
        users.add(User.createRegularUser("kevin","ameda"));
        users.add(User.createRegularUser("oscar","kisala"));
        users.add(User.createRegularUser("judith","angiya"));
        users.add(User.createRegularUser("ruth","andisi"));
        Mockito.when(repository.findAll()).thenReturn(users);
        /* act */
        Set<User> actualUsers  = userService.getRegularUsers();
        /* assert */

//        Assert.assertNotNull(actualUsers);
//        Assert.assertEquals(4,actualUsers.size());

        for(User actualUser: actualUsers){
            Assert.assertNotNull(actualUser); // at least the object should not be null.
            Assert.assertEquals(actualUser.getUserType(), User.UserType.REGULAR_USER);
        }
    }

    @Test
    public void getRegularUsers_hamcrest() {
        /* arrange */
        List<User> users = new ArrayList<>();
        users.add(User.createRegularUser("kevin","ameda"));
        users.add(User.createRegularUser("oscar","kisala"));
        users.add(User.createRegularUser("judith","angiya"));
        users.add(User.createRegularUser("ruth","andisi"));
        Mockito.when(repository.findAll()).thenReturn(users);
        /* act */
        Set<User> actualUsers  = userService.getRegularUsers();
        /* assert */

        //Hamcrest descriptive assertions
        Assert.assertThat(actualUsers, CoreMatchers.is(CoreMatchers.notNullValue()));
        Assert.assertThat(actualUsers.size(), CoreMatchers.equalTo(4));
        for(User actualUser: actualUsers){
            Assert.assertThat(actualUsers, CoreMatchers.is(CoreMatchers.notNullValue()));
            Assert.assertNotNull(actualUser); // at least the object should not be null.
            Assert.assertEquals(actualUser.getUserType(), User.UserType.REGULAR_USER);
        }
    }


    @Test
    public void getAdminUsers() {
    }
}