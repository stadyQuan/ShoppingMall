package com.myzy.small.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myzy.small.bean.PmsBaseCatalog1;
import com.myzy.small.bean.PmsBaseCatalog2;
import com.myzy.small.bean.PmsBaseCatalog3;
import com.myzy.small.service.CatalogService;

import java.util.List;

/**
 * 商品目录Controller层
 * @author quanhx
 */
@RestController
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }
}
