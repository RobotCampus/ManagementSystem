package com.example.springbootmybatisrobot;

import com.example.springbootmybatisrobot.Mapper.UserMapper;
import com.example.springbootmybatisrobot.po.User;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class springtest {
@Autowired
   private UserMapper userMapper;

    @Test
    public void testmybatis(){
        List<User> lists = userMapper.selectList(null);
        Assert.assertEquals(5, lists.size());
        lists.forEach(System.out::println);
    }


}