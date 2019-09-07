package com.myzy.small.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myzy.small.bean.UserReceiveAddress;
import com.myzy.small.service.UserReceiveAddressService;
import com.myzy.small.user.mapper.UserReceiveAddressMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户收货地址服务实现层
 * @author quanhx
 */
@Service
public class UserReceiveAddressServiceImpl implements UserReceiveAddressService {

    private static final int DEFAULT_STATUS = 1;

    @Resource
    UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<UserReceiveAddress> getUserReceiveAddress(Integer userId) {
        UserReceiveAddress address = new UserReceiveAddress();
        address.setUserId(userId+"");
        return userReceiveAddressMapper.select(address);
    }

    @Override
    public UserReceiveAddress getDefaultUserReceiveAddress(Integer userId) {
        UserReceiveAddress address = new UserReceiveAddress();
        address.setUserId(userId+"");
        address.setDefaultStatus(DEFAULT_STATUS);
        return userReceiveAddressMapper.selectOne(address);
    }

    @Override
    public Integer addUserReceiveAddress(UserReceiveAddress address) {
        return userReceiveAddressMapper.insert(address);
    }

    @Override
    public Integer removeUserReceiveAddress(Integer id) {
        return userReceiveAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUserReceiveAddress(UserReceiveAddress address) {
        return userReceiveAddressMapper.updateByPrimaryKey(address);
    }
}
