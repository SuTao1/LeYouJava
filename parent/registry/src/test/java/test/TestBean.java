package test;


import com.leyou.registry.RegistryApplication;
import com.leyou.registry.entity.Users;
import com.leyou.registry.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RegistryApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class TestBean {

    @Autowired
    private UserService userService;

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @Test
    public void t(){
       /* List<Users> users = userService.selectAllUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUname());

        }*/

    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }
}
