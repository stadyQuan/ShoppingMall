package com.myzy.small.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myzy.small.bean.UserInfo;
import com.myzy.small.service.UserService;
import com.myzy.small.user.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务实现层
 * @author quanhx
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public UserInfo getUser(UserInfo user) {
        return userMapper.selectOne(user);
    }

    @Override
    public UserInfo getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Integer updateUser(UserInfo userInfo) {
        return userMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public Integer deleteUser(UserInfo userInfo) {
        return userMapper.delete(userInfo);
    }

    @Override
    public Integer addUser(UserInfo userInfo) {
        return userMapper.insert(userInfo);
    }
}
