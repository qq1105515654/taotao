package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @Author：盛年华
 * @Date：2018/6/26 16:59
 * @Description: 订单商品信息
 */
@Table(name = "tb_order_item")
public class OrderItemInfo extends BaseEntity {

    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private Long itemId;


    /**
     * 订单Id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 商品购买数量
     */
    @Column(name = "num")
    private int num;

    /**
     * 商品标题
     */
    @Column(name = "title")
    private String title;


    /**
     * 商品单价
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 商品总金额
     */
    @Column(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    private String picPath;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
