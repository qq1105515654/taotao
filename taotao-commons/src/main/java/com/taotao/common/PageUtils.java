package com.taotao.common;

/**
 * @Author：盛年华
 * @Date：2018/7/5 13:30
 * @Description:
 */
public class PageUtils {

    public static int getStart(int start,int pageSize){
        return (start/pageSize)+1;
    }
}
