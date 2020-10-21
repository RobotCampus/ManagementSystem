package com.example.springbootmybatisrobot.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data

@TableName("t_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String phoneNumber;




}
