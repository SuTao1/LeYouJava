package com.leyou.registry.service.impl;

import com.leyou.registry.entity.Users;
import com.leyou.registry.entity.UsersExample;
import com.leyou.registry.mapper.UsersMapper;
import com.leyou.registry.result.AppResult;
import com.leyou.registry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AppResult selectAllUsers() {
        /*UsersExample example = new UsersExample();
        example.createCriteria().andUidEqualTo("a");*/
        Users users = new Users();
        users.setUname("王五");
        users.setPassword("123");
        int count = usersMapper.insertSelective(users);
        System.out.println(count + " _____________________________");
        List<Users> list = usersMapper.selectByExample(null);
        Users users1 = new Users();
        users1.setUname("老王八");
        users1.setPassword("123");
        int count1 = usersMapper.insertSelective(users);
        int i = 1 / 0;
        System.out.println(count1 + " ======================================");

        return new AppResult(true, "查询成功", 200, list);
    }
}
