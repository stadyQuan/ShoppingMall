package com.myzy.small.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myzy.common.Status;
import com.myzy.small.bean.PmsBaseAttrInfo;
import com.myzy.small.bean.PmsBaseAttrValue;
import com.myzy.small.manage.mapper.AttrInfoMapper;
import com.myzy.small.manage.mapper.AttrValueMapper;
import com.myzy.small.service.AttrService;
import org.apache.commons.lang3.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品信息Service实现层
 *
 * @author quanhx
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    private AttrInfoMapper attrInfoMapper;

    @Resource
    private AttrValueMapper attrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3) {
        PmsBaseAttrInfo attrInfo = new PmsBaseAttrInfo();
        attrInfo.setCatalog3Id(catalog3);
        return attrInfoMapper.select(attrInfo);
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValue(String attrInfoId) {
        PmsBaseAttrValue attrValue = new PmsBaseAttrValue();
        attrValue.setAttrId(attrInfoId);
        return attrValueMapper.select(attrValue);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        if(StringUtils.isBlank(pmsBaseAttrInfo.getId())){
            attrInfoMapper.insertSelective(pmsBaseAttrInfo);
            List<PmsBaseAttrValue> attrValues = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue attrValue : attrValues) {
                attrValue.setAttrId(pmsBaseAttrInfo.getId());
                attrValueMapper.insertSelective(attrValue);
            }
        }else {

            Example example = new Example(PmsBaseAttrInfo.class);
            example.createCriteria().andEqualTo("id",pmsBaseAttrInfo.getId());
            attrInfoMapper.updateByExampleSelective(pmsBaseAttrInfo,example);

            PmsBaseAttrValue attrValue = new PmsBaseAttrValue();
            attrValue.setAttrId(pmsBaseAttrInfo.getId());
            attrValueMapper.delete(attrValue);

            List<PmsBaseAttrValue> attrValues = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue baseAttrValue : attrValues) {
                baseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                attrValueMapper.insert(baseAttrValue);
            }
        }
        return Status.STATUS_SUCCESS;
    }

    @Override
    public String removeAttrInfo(String attrInfoId) {

        PmsBaseAttrValue attrValue = new PmsBaseAttrValue();
        attrValue.setAttrId(attrInfoId);
        attrValueMapper.delete(attrValue);

        attrInfoMapper.deleteByPrimaryKey(attrInfoId);
        return Status.STATUS_SUCCESS;
    }

    @Override
    public String removeAttrValue(String attrValueId) {
        attrValueMapper.deleteByPrimaryKey(attrValueId);
        return Status.STATUS_SUCCESS;
    }

    @Override
    public int updateAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        return 0;
    }

    @Override
    public int updateAttrValue(PmsBaseAttrValue pmsBaseAttrValue) {
        return 0;
    }
}
