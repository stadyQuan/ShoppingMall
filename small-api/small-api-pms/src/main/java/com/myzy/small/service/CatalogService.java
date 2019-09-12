package com.myzy.small.service;

import com.myzy.small.bean.PmsBaseCatalog1;
import com.myzy.small.bean.PmsBaseCatalog2;
import com.myzy.small.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * 目录服务层
 * @author quanhx
 */
public interface CatalogService {

    /**
     * 获取商品的一级目录
     * @return 所有商品的一级目录
     */
    List<PmsBaseCatalog1> getCatalog1();

    /**
     * 获取根据商品的一级目录获取对应的所有二级目录
     *
     * @param catalog1Id 商品一级目录Id
     * @return 商品的一级目录获取对应的所有二级目录
     */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 获取根据商品的二级目录获取对应的所有三级目录
     *
     * @param catalog2Id 商品二级目录Id
     * @return 商品的二级目录获取对应的所有三级目录
     */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
