package com.taotao.enums;

import com.taotao.pojo.ItemInfo;

/**
 * @Author：盛年华
 * @Date：2018/7/5 16:03
 * @Description:
 */
public enum ItemInfoEnum {
    SUCCESS("200","更新成功"),
    FAIL("500","更新失败");

    private String code;
    private String msg;

    private ItemInfo itemInfo;

    private ItemInfoEnum(String code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }
}
