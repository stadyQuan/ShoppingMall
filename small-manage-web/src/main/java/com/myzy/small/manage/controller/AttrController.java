package com.myzy.small.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myzy.common.Status;
import com.myzy.small.bean.PmsBaseAttrInfo;
import com.myzy.small.bean.PmsBaseAttrValue;
import com.myzy.small.service.AttrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品信息 Controller层
 *
 * @author quanhx
 */
@RestController
@CrossOrigin
public class AttrController {

    @Reference
    private AttrService attrService;

    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id){
        return attrService.getAttrInfo(catalog3Id);
    }

    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        return attrService.getAttrValue(attrId);
    }

    @RequestMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo attrInfo){
        String status = attrService.saveAttrInfo(attrInfo);
        if(status.equals(Status.STATUS_SUCCESS)){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/removeAttrInfoById")
    public String removeAttrInfo(String attrInfoId){
        String status = attrService.removeAttrInfo(attrInfoId);
        if(status.equals(Status.STATUS_SUCCESS)){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/removeAttrValue")
    public String removeAttrValue(String attrInfoId){
        String status = attrService.removeAttrValue(attrInfoId);
        if(status.equals(Status.STATUS_SUCCESS)){
            return "success";
        }
        return "error";
    }

}
