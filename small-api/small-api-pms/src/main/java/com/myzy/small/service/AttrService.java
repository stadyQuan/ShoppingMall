package com.myzy.small.service;


import com.myzy.small.bean.PmsBaseAttrInfo;
import com.myzy.small.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * 商品属性服务层
 *
 *
 * @author quanhx
 */
public interface AttrService {

    /**
     * 获取对应目录3下所有属性信息
     *
     * @param catalog3 目录3
     * @return 所有商品信息
     */
    List<PmsBaseAttrInfo> getAttrInfo(String catalog3);

    /**
     * 获取对应商品属性ID下所有属性值
     *
     * @param attrInfoId 商品属性ID
     * @return 所有商品属性值
     */
    List<PmsBaseAttrValue> getAttrValue(String attrInfoId);

    /**
     * 添加对应目录3商品属性信息
     *
     * @param pmsBaseAttrInfo 商品属性
     * @return 成功或失败
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 移除对应商品属性
     *
     *
     * @param attrInfoId 商品属性ID
     * @return 移除成功或失败
     */
    String removeAttrInfo(String attrInfoId);

    /**
     * 移除对应商品属性值
     *
     *
     * @param attrValueId 商品属性值Id
     * @return 移除成功或失败
     */
    String removeAttrValue(String attrValueId);

    /**
     * 更新对应商品属性
     *
     * @param pmsBaseAttrInfo 对应的商品属性
     * @return 更新成功或失败
     */
    int updateAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 更新对应商品属性值
     *
     * @param pmsBaseAttrValue 对应的商品属性值
     * @return 更新成功或失败
     */
    int updateAttrValue(PmsBaseAttrValue pmsBaseAttrValue);

}
