package com.example.provider.serviceImpl;

import com.example.provider.entity.UserBean;
import com.example.provider.mapper.UserMapper;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lixiaotian
 * @since 2021/06/25 14:36
 */
@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public String loginIn(int id) {
        return userMapper.getInfo(id);
    }
}
