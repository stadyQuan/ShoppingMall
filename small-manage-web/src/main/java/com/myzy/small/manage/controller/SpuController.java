package com.myzy.small.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myzy.common.Status;
import com.myzy.small.bean.*;
import com.myzy.small.service.SpuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 当个商品单元的Controller层
 *
 * @author quanhx
 */
@RestController
@CrossOrigin
public class SpuController {

    @Reference
    private SpuService spuService;

    @RequestMapping("/spuList")
    public List<PmsProductInfo> spuList(String catalog3Id){
        return spuService.spuList(catalog3Id);
     }

     @RequestMapping("/spuSaleAttrList")
     public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){
        return spuService.spuSaleAttrList(spuId);
     }

     @RequestMapping("/spuImageList")
     public List<PmsProductImage> spuImageList(String spuId){
        return spuService.spuImageList(spuId);
     }

     @RequestMapping("/baseSaleAttrList")
     public List<PmsBaseSaleAttr> baseSaleAttrList(){
        return spuService.baseSaleAttrList();
     }

     @RequestMapping("/saveSpuInfo")
     public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        Integer status = spuService.saveSpuInfo(pmsProductInfo);
        if(status.equals(Status.STATUS_CODE_SUCCESS)){
            return Status.STATUS_SUCCESS;
        }
        return Status.STATUS_ERROR;
     }


}
