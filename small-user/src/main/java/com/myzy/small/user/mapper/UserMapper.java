package com.myzy.small.user.mapper;

import com.myzy.small.user.bean.UserInfo;

import java.util.List;

/**
 * 用户服务数据层
 * @author quanhx
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 返回所有用户
     */
    List<UserInfo> selectAllUser();
}
