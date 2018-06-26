package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author：盛年华
 * @Date：2018/6/26 16:29
 * @Description: 商品描述
 */
@Table(name = "tb_item_desc")
public class ItemDescInfo extends BaseEntity {

    /**
     * 商品Id
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 商品描述
     */
    @Column(name = "item_desc")
    private String itemDesc;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
