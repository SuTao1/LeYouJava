package com.leyou.registry;

import com.leyou.registry.entity.Users;
import com.leyou.registry.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RegistryApplication.class)
public class FatherTest {

    @Autowired
    private UserService userService;

    @Test
    public void t(){
        /*List<Users> users = userService.selectAllUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUname());
        }*/

    }
}
