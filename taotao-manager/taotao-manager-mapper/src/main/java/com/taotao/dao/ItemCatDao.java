package com.taotao.dao;

import com.taotao.pojo.ItemCatInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author：盛年华
 * @Date：2018/6/27 14:26
 * @Description:
 */
public interface ItemCatDao {

    /**
     * 根据类目ID 查询该类目
     * @param id
     * @return
     */
    @Select("select * from tb_item_cat where id=#{id}")
    ItemCatInfo getItemCatById(@Param("id") Long id);

    /**
     * 查询所有的类目节点
     * @return
     */
    @Select("select * from tb_item_cat")
    List<ItemCatInfo> getItemCatAll();

    /**
     * 根据父ID来查询 该父节点下的所有子节点
     * @param parentId
     * @return
     */
    @Select("select * from tb_item_cat where parent_id=#{parentId}")
    List<ItemCatInfo> getItemCatByParentId(@Param("parentId") Long parentId);


}
