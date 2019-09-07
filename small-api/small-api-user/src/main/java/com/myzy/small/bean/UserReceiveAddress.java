package com.myzy.small.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用户收获地址实体类
 * @author quanhx
 */
@Setter
@Getter
public class UserReceiveAddress implements Serializable {
    @Id
    private String id;
    private String userId;
    private String  name;
    private String  phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
