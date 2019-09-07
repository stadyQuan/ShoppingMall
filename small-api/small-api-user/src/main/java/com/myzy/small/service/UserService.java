package com.myzy.small.service;

import com.myzy.small.bean.UserInfo;

import java.util.List;

/**
 * 用户服务层
 * @author quanhx
 */
public interface UserService {

    /**
     * 查询所有用户方法
     * @return
     */
    List<UserInfo> getAllUser();

    /**
     * 获取用户信息
     * @param user 用户信息
     * @return 用户信息
     */
    UserInfo getUser(UserInfo user);

    /**
     * 获取用户Id
     * @param userId 用户Id
     * @return 用户信息
     */
    UserInfo getUserById(Integer userId);

    /**
     * 更新用户
     * @param userInfo 更新的用户信息
     * @return 更新后的用户信息
     */
    Integer updateUser(UserInfo userInfo);

    /**
     * 删除用户信息
     * @param userInfo 用户信息
     * @return 返回用户信息
     */
    Integer deleteUser(UserInfo userInfo);

    /**
     * 插入用户信息
     * @param userInfo 插入的用户信息
     * @return 插入成功或失败
     */
    Integer addUser(UserInfo userInfo);
}
