package com.taotao.service.impl;

import com.taotao.dao.ItemDao;
import com.taotao.pojo.ItemInfo;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：盛年华
 * @Date：2018/6/28 9:15
 * @Description:
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public ItemInfo getItemInfoById(Long id) {
        if(id==null){
            return null;
        }
        return itemDao.getItemInfoById(id);
    }
}
