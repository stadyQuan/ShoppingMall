package com.myzy.small.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * 商品三级目录
 * @author quanhx
 */
@Getter
@Setter
public class PmsBaseCatalog3 implements Serializable {

    @Id
    private String id;
    private String name;
    private String catalog2Id;

}
