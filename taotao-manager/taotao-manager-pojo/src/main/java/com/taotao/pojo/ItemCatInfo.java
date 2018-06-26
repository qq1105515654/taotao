package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author：盛年华
 * @Date：2018/6/26 16:27
 * @Description: 商品类目
 */
@Table(name = "tb_item_cat")
public class ItemCatInfo extends BaseEntity {

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 分类名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 排列序号，表示同级类目的展现次序，
     * 如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @Column(name="sort_order")
    private int sortOrder;

    /**
     * 该类目是否为父类目
     * 1为true，0为false
     */
    @Column(name = "is_parent")
    private int isParent;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getIsParent() {
        return isParent;
    }

    public void setIsParent(int isParent) {
        this.isParent = isParent;
    }
}
