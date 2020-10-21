package com.example.springbootmybatisrobot.Controller;

import com.example.springbootmybatisrobot.Service.UserService;
import com.example.springbootmybatisrobot.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String test(){
       System.out.println(userService.list());

        return "index";
    }

}
