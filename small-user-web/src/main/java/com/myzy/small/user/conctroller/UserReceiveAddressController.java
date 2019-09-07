package com.myzy.small.user.conctroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myzy.small.bean.UserReceiveAddress;
import com.myzy.small.service.UserReceiveAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户收货地址Controller层
 * @author quanhx
 */
@RestController
public class UserReceiveAddressController {

    @Reference
    private  UserReceiveAddressService userReceiveAddressService;


    @RequestMapping("/getUserReceiveAddress")
    public List<UserReceiveAddress> getUserReceiveAddress(Integer userId){
        return userReceiveAddressService.getUserReceiveAddress(userId);
    }

}
