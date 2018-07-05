package com.taotao.dao;

import com.taotao.pojo.ItemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/6/27 14:26
 * @Description:
 */
public interface ItemDao {

    @Select("select * from tb_item where id=#{id}")
    ItemInfo getItemInfoById(@Param("id") Long id);

    @Select("select * from tb_item")
    List<ItemInfo> getItemAll();

    @Update("update tb_item set status=#{status} where id=#{id}")
    int setItemInfoStatus(@Param("id") Long id,@Param("status") int status);

}
