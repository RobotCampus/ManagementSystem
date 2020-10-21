package com.example.springbootmybatisrobot.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisrobot.Mapper.DestinationMapper;
import com.example.springbootmybatisrobot.Service.DestinationService;
import com.example.springbootmybatisrobot.po.Destination;
import org.springframework.stereotype.Service;

@Service
/**
 * @description:地点服务实现类
 * @author:zbzbzb
 * @create:2020--10--20
 */
public class DestinationServiceImpl extends ServiceImpl<DestinationMapper, Destination> implements DestinationService {
}
