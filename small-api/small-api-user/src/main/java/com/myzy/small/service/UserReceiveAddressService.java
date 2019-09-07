package com.myzy.small.service;

import com.myzy.small.bean.UserReceiveAddress;

import java.util.List;

/**
 * 用户收货地址服务层
 * @author quanhx
 */
public interface UserReceiveAddressService {

    /**
     * 获取用户所有收货地址
     *
     * @param userId 用户ID
     * @return 该玩家所有收货地址
     */
    List<UserReceiveAddress> getUserReceiveAddress(Integer userId);

    /**
     * 获取用户默认的收货地址
     *
     * @param userId 用户ID
     * @return 默认收获地址
     */
    UserReceiveAddress getDefaultUserReceiveAddress(Integer userId);

    /**
     * 增加用户收货地址
     *
     * @param address 新增地址
     * @return 增加成功或失败
     */
    Integer addUserReceiveAddress(UserReceiveAddress address);

    /**
     * 删除用户的收货地址
     *
     * @param id 地址ID
     * @return 删除成功或者失败
     */
    Integer removeUserReceiveAddress(Integer id);

    /**
     * 更新用户的收货地址
     *
     * @param address 更新的地址
     * @return 更新成功或失败
     */
    Integer updateUserReceiveAddress(UserReceiveAddress address);

}
