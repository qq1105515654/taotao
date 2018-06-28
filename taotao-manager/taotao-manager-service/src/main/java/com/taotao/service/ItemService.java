package com.taotao.service;

import com.taotao.pojo.ItemInfo;

import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/6/28 9:15
 * @Description:
 */
public interface ItemService {

    ItemInfo getItemInfoById(Long id);

    List<ItemInfo> getItemAll();
}
