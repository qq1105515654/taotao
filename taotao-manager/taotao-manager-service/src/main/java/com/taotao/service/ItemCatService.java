package com.taotao.service;

import com.taotao.pojo.ItemCatInfo;

import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/7/5 14:36
 * @Description:
 */
public interface ItemCatService {

    ItemCatInfo getItemCatById(Long id);

    List<ItemCatInfo> getItemCatAll();

    List<ItemCatInfo> getItemCatByParentId(Long parentId);
}
