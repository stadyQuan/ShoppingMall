package com.myzy.small.service;

import com.myzy.small.bean.PmsBaseSaleAttr;
import com.myzy.small.bean.PmsProductImage;
import com.myzy.small.bean.PmsProductInfo;
import com.myzy.small.bean.PmsProductSaleAttr;

import java.util.List;

/**
 * Spu（单个商品单元）服务
 * @author quanhx
 */
public interface SpuService {
    /**
     * 获取该3级目录下的所有商品系列
     * @param catalog3Id 3级目录
     * @return 商品系列
     */
    List<PmsProductInfo> spuList(String catalog3Id);

    /**
     * 获取当前系列下的所有对应数值
     * @param spuId 商品系列Id
     * @return 商品系列集合
     */
    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);


    /**
     * 获取产品系列图片
     * @param spuId 商品系列Id
     * @return 产品系列图片
     */
    List<PmsProductImage> spuImageList(String spuId);

    /**
     * 获取所有的销售属性
     *
     * @return 销售属性
     */
    List<PmsBaseSaleAttr> baseSaleAttrList();

    /**
     * 保存商品系列信息
     * @param pmsProductInfo 商品系列信息
     * @return 成功或者失败
     */
    Integer saveSpuInfo(PmsProductInfo pmsProductInfo);
}
