package com.taotao.service.impl;

import com.taotao.dao.ItemCatDao;
import com.taotao.pojo.ItemCatInfo;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：盛年华
 * @Date：2018/7/5 14:37
 * @Description:
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private ItemCatDao itemCatDao;

    @Override
    public ItemCatInfo getItemCatById(Long id) {
        if (id!=null){
            return itemCatDao.getItemCatById(id);
        }
        return null;
    }
}
