package com.example.springbootmybatisrobot.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;


@Data
@TableName("t_admin")
public class Admin {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;


}

