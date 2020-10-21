package com.example.springbootmybatisrobot.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@TableName("t_destination")
public class Destination {
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal XDest;
    private BigDecimal YDest;
    private String dest_name;
    private String dest_description;




}

