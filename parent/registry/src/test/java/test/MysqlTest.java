package test;

import com.leyou.registry.entity.Users;
import com.leyou.registry.result.AppResult;
import com.leyou.registry.service.UserService;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MysqlTest extends TestBean {

    @Autowired
    private UserService userService;

    @Test
    public void t(){
        AppResult users = userService.selectAllUsers();
        List<Users> list = (List<Users>)users.getData();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUname());
        }
    }
}
