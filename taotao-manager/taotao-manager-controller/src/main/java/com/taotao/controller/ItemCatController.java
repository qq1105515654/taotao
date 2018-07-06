package com.taotao.controller;

import com.taotao.common.BaseController;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/7/6 14:41
 * @Description:
 */
@RequestMapping("/itemCat")
public class ItemCatController extends BaseController {

    @Autowired
    private ItemCatService itemCatService;

    @PostMapping("/all")
    @ResponseBody
    public Object getItemCatAll(){
        return itemCatService.getItemCatAll();
    }

    @PostMapping("/byParentId/{parentId}")
    public Object getItemCatByParentId(@PathVariable Long parentId){

        if(parentId!=null){
            return success(itemCatService.getItemCatByParentId(parentId));
        }
        return failed("操作失败!");
    }
}
