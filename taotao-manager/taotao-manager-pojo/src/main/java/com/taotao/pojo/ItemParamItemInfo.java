package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author：盛年华
 * @Date：2018/6/26 16:37
 * @Description: 商品参数
 */
@Table(name = "tb_item_param_item")
public class ItemParamItemInfo extends BaseEntity {

    /**
     * 商品Id
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 参数数据，数据格式为：json格式
     */
    @Column(name = "param_data")
    private String paramData;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
}
