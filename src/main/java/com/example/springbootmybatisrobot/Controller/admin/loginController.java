package com.example.springbootmybatisrobot.Controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootmybatisrobot.Service.AdminService;
import com.example.springbootmybatisrobot.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.sql.Wrapper;

@Controller
@RequestMapping("/admin")
public class loginController {
    @Autowired
    private AdminService adminService;
@GetMapping("/login")
    public String login(){
    return "admin/login";
}
@PostMapping("/login")
    public String PostLogin(@RequestParam String username, @RequestParam String password, HttpSession httpSession, RedirectAttributes redirectAttributes){
    Admin admin =new Admin();
    admin.setUsername(username);
    admin.setPassword(password);
    QueryWrapper<Admin> queryWrapper =new QueryWrapper<Admin>();
    queryWrapper.eq("username",username).eq("password",password);


    if(adminService.getOne(queryWrapper)==null){
        redirectAttributes.addFlashAttribute("message","用户名密码错误");
        return "redirect:/admin/login";
    }else{
        admin.setPassword(null);
        httpSession.setAttribute("admin",admin);
        return "admin/index";

    }
}
}
