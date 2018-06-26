package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author：盛年华
 * @Date：2018/6/26 16:33
 * @Description: 商品类目参数
 */
@Table(name = "tb_item_param")
public class ItemParamInfo  extends BaseEntity{

    /**
     * 商品类目ID
     */
    @Column(name = "item_cat_id")
    private Long itemCatId;

    /**
     * 参数数据， 数据格式为：json格式
     */
    @Column(name = "param_data")
    private String paramData;

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
}
