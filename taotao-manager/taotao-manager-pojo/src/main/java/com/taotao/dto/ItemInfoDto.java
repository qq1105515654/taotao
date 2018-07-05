package com.taotao.dto;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author：盛年华
 * @Date：2018/7/5 14:31
 * @Description:
 */
public class ItemInfoDto implements Serializable {
    /**
     * 商品ID
     * */
    private long id;
    /**
     * 创建时间
     * */
    private String createTime;
    /**
     * 修改時間
     * */
    private String updateTime;

    private String status;
    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品卖点
     */
    private String sellPoint;

    /**
     * 商品单价，单位为分。
     */
    private String price;

    /**
     * 库存数量
     */
    private int num;

    /**
     * 商品图片
     */
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *  所属类目， 叶子类目
     */

    private String type;

    /*审核状态*/
    private String auditStatus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;

    }

    @Override
    public String toString() {
        return "ItemInfoDto{" +
                "title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price='" + price + '\'' +
                ", num=" + num +
                ", image='" + image + '\'' +
                ", type='" + type + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                '}';
    }
}
