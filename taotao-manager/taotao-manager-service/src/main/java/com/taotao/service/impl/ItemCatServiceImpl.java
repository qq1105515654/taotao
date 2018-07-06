package com.taotao.service.impl;

import com.taotao.dao.ItemCatDao;
import com.taotao.pojo.ItemCatInfo;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查询所有的类目节点
     * @return
     */
    @Override
    public List<ItemCatInfo> getItemCatAll() {
        return itemCatDao.getItemCatAll();
    }

    /**
     * 根据 父节点Id 查询该父类Id下所有的子节点
     * @param parentId
     * @return
     */
    @Override
    public List<ItemCatInfo> getItemCatByParentId(Long parentId) {
        if(parentId!=null){
            return itemCatDao.getItemCatByParentId(parentId);
        }
        return null;
    }
}
