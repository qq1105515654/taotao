package com.taotao.dao;

import com.taotao.pojo.ItemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author：盛年华
 * @Date：2018/6/27 14:26
 * @Description:
 */
@Mapper
public interface ItemDao {

    @Select("select * from tb_item where id=#{id}")
    ItemInfo getItemInfoById(@Param("id") Long id);

}
