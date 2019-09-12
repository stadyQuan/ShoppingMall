package com.myzy.small.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myzy.small.manage.mapper.Catalog1Mapper;
import com.myzy.small.manage.mapper.Catalog2Mapper;
import com.myzy.small.manage.mapper.Catalog3Mapper;
import com.myzy.small.bean.PmsBaseCatalog1;
import com.myzy.small.bean.PmsBaseCatalog2;
import com.myzy.small.bean.PmsBaseCatalog3;
import com.myzy.small.service.CatalogService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品目录实现层
 *
 * @author quanhx
 * @date 2019/09/08
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Resource
    Catalog1Mapper catalog1Mapper;

    @Resource
    Catalog2Mapper catalog2Mapper;

    @Resource
    Catalog3Mapper catalog3Mapper;



    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return catalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return catalog3Mapper.select(pmsBaseCatalog3);
    }
}
