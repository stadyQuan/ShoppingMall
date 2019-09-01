package com.myzy.small.user.service.impl;

import com.myzy.small.user.bean.UserInfo;
import com.myzy.small.user.mapper.UserMapper;
import com.myzy.small.user.service.UserService;
import org.springframework.stereotype.Service;

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
    public Integer insertUser(UserInfo userInfo) {
        return userMapper.insert(userInfo);
    }
}
