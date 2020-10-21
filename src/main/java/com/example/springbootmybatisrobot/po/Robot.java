package com.example.springbootmybatisrobot.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data

@TableName ("robot")
public class Robot {
    @Id
    @GeneratedValue
    private Long id;
    private String keyMD5;   //MD5码的id值
    private String description;
    private String password;



}
