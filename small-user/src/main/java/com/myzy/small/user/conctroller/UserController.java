package com.myzy.small.user.conctroller;

import com.myzy.small.user.bean.UserInfo;
import com.myzy.small.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户Controller层
 * @author quanhx
 */
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("getAllUser")
    public List<UserInfo> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("getUser/{id}")
    public UserInfo getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @RequestMapping("index")
    public String hello(){
        return "hello word";
    }
}
