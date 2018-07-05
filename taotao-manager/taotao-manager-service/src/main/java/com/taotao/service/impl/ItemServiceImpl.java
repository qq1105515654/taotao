package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.PageResult;
import com.taotao.dao.ItemDao;
import com.taotao.dto.ItemInfoDto;
import com.taotao.pojo.ItemCatInfo;
import com.taotao.pojo.ItemInfo;
import com.taotao.service.ItemCatService;
import com.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/6/28 9:15
 * @Description:
 */
@Service
public class ItemServiceImpl implements ItemService {

    Logger logger=LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ItemCatService itemCatService;

    @Override
    public ItemInfo getItemInfoById(Long id) {
        if(id==null){
            return null;
        }
        return itemDao.getItemInfoById(id);
    }

    @Override
    public PageResult<ItemInfo> getItemAll(int pageNo, int pageSize) {

        PageHelper.startPage(pageNo,pageSize);

        List<ItemInfo> list=itemDao.getItemAll();

        for (ItemInfo info:list) {
            ItemCatInfo catInfo=itemCatService.getItemCatById(Long.parseLong(info.getCid()));
            info.setCid(catInfo.getName());
            info.setAuditStatus(info.getAuditStatus().equals("0")?"审核中":"通过");
        }

        PageInfo<ItemInfo> pageInfo=new PageInfo<>(list);

        PageResult<ItemInfo> pageResult=new PageResult(pageInfo);

        logger.info("商品总数量:'{}'",pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public int setItemInfoStatus(Long id, int status) {
        if(id!=null && status!=0){
            return itemDao.setItemInfoStatus(id,status);
        }
        return 0;
    }
}
