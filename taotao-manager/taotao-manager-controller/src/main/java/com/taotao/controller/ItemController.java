package com.taotao.controller;

import com.taotao.common.BaseController;
import com.taotao.common.PageResult;
import com.taotao.common.PageUtils;
import com.taotao.dto.ItemInfoDto;
import com.taotao.enums.ItemInfoEnum;
import com.taotao.pojo.ItemInfo;
import com.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author：盛年华
 * @Date：2018/6/28 9:18
 * @Description:
 */
@Controller
@RequestMapping("/item")
public class ItemController  extends BaseController {

    Logger logger=LoggerFactory.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @RequestMapping("/info/{itemId}")
    @ResponseBody
    public Object getItemInfoById(@PathVariable Long itemId, HttpServletRequest request){

        return itemService.getItemInfoById(itemId);
    }

    @PostMapping("/all")
    @ResponseBody
    public Object getItemAll(int start,int length,String condition,HttpServletRequest request){
        int pageNo=PageUtils.getStart(start,length);
        PageResult<ItemInfo> itemInfoDto=itemService.getItemAll(pageNo,length);
        logger.info("查询出的商品数据:'{}'",itemInfoDto.getData());
        return itemInfoDto;
    }

    @PostMapping("/update/{id}/{status}")
    @ResponseBody
    public Object setItemInfoStatus(@PathVariable Long id,@PathVariable int status){

        int updateCount=itemService.setItemInfoStatus(id,status);
        if(updateCount==1){
            return success();
        }
        return failed("操作失败，请稍后再试");
    }

    @PostMapping("/del/{id}")
    @ResponseBody
    public Object deleteItemInfo(@PathVariable Long id){
        int deleteCount=itemService.deleteItemInfo(id);
        if(deleteCount==1){
            return success();
        }
        return failed("刪除失败，请稍后再试！");
    }
}
