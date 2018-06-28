package com.taotao.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taotao.pojo.ItemInfo;
import com.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @Author：盛年华
 * @Date：2018/6/28 9:18
 * @Description:
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    Logger logger=LoggerFactory.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @RequestMapping("/info/{itemId}")
    @ResponseBody
    public Object getItemInfoById(@PathVariable Long itemId, HttpServletRequest request){

        return itemService.getItemInfoById(itemId);
    }

    @GetMapping("/all")
    @ResponseBody
    public Object getItemAll(HttpServletRequest request){

        List<ItemInfo> list=itemService.getItemAll();
        logger.info("查询出的商品数据:'{}'",list);
        return list;
    }
}
