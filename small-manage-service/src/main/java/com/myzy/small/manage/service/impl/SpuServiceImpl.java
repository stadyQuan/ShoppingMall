package com.myzy.small.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myzy.common.Status;
import com.myzy.small.bean.PmsBaseSaleAttr;
import com.myzy.small.bean.PmsProductImage;
import com.myzy.small.bean.PmsProductInfo;
import com.myzy.small.bean.PmsProductSaleAttr;
import com.myzy.small.manage.mapper.ProductInfoMapper;
import com.myzy.small.manage.mapper.ProductSaleAttrMapper;
import com.myzy.small.manage.mapper.SaleAttrMapper;
import com.myzy.small.service.SpuService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Resource
    ProductInfoMapper productInfoMapper;

    @Resource
    SaleAttrMapper saleAttrMapper;

    @Resource
    ProductSaleAttrMapper productSaleAttrMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfo productInfo = new PmsProductInfo();
        productInfo.setCatalog3Id(catalog3Id);
        return productInfoMapper.select(productInfo);
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId) {
        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
        pmsProductSaleAttr.setProductId(spuId);
        return productSaleAttrMapper.select(pmsProductSaleAttr);
    }

    @Override
    public List<PmsProductImage> spuImageList(String spuId) {
        return null;
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return saleAttrMapper.selectAll();
    }

    @Override
    public Integer saveSpuInfo(PmsProductInfo pmsProductInfo) {
        if(StringUtils.isBlank(pmsProductInfo.getId())){
            int insertSelective = productInfoMapper.insertSelective(pmsProductInfo);
            if (insertSelective <= 0){
                return Status.STATUS_CODE_ERROR;
            }
            List<PmsProductSaleAttr>
        }
        return null;
    }
}
