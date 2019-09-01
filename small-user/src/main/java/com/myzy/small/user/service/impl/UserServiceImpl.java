package com.myzy.small.user.service.impl;

import com.myzy.small.user.bean.UserInfo;
import com.myzy.small.user.mapper.UserMapper;
import com.myzy.small.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户服务实现层
 * @author quanhx
 */
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<UserInfo> getAllUser() {
        return userMapper.selectAllUser();
    }
}
