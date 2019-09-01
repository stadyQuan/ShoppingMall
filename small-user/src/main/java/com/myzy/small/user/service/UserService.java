package com.myzy.small.user.service;

import com.myzy.small.user.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务层
 * @author quanhx
 */
@Service
public interface UserService {

    /**
     * 查询所有用户方法
     * @return
     */
    List<UserInfo> getAllUser();
}
