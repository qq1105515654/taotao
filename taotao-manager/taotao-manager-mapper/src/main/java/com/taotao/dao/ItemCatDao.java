package com.taotao.dao;

import com.taotao.pojo.ItemCatInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author：盛年华
 * @Date：2018/6/27 14:26
 * @Description:
 */
public interface ItemCatDao {

    @Select("select * from tb_item_cat where id=#{id}")
    ItemCatInfo getItemCatById(@Param("id") Long id);
}
