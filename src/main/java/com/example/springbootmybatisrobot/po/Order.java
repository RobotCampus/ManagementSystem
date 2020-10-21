package com.example.springbootmybatisrobot.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Data
@TableName ( "t_order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    private BigDecimal departX;
    private BigDecimal departY;
    private BigDecimal destX;
    private BigDecimal destY;
    private Boolean isSaved;
    private Boolean isUsed;


    private Long destination_id;

    private Long user_id;

    private Long robot_id;


}
