package com.taotao.service;

import com.taotao.common.PageResult;
import com.taotao.dto.ItemInfoDto;
import com.taotao.pojo.ItemInfo;

/**
 * @Author：盛年华
 * @Date：2018/6/28 9:15
 * @Description:
 */
public interface ItemService {

    ItemInfo getItemInfoById(Long id);

    PageResult<ItemInfo> getItemAll(int pageNo, int pageSize);

    int setItemInfoStatus(Long id,int status);

    int deleteItemInfo(Long id);
}
