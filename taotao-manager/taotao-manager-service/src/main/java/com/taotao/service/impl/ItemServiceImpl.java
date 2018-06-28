package com.taotao.service.impl;

import com.taotao.dao.ItemDao;
import com.taotao.pojo.ItemInfo;
import com.taotao.service.ItemService;
import org.apache.tomcat.jni.Local;
import org.joda.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

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

    @Override
    public List<ItemInfo> getItemAll() {
        List<ItemInfo> list=itemDao.getItemAll();
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (ItemInfo item:list) {

        }*/
        return list;
    }
}
