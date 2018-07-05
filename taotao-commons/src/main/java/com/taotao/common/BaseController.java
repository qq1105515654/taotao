package com.taotao.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ethan
 * @date 2016年10月12日 下午4:48:38
 * @email windofdusk@gmail.com
 * 类说明
 */
public abstract class BaseController<T> {
    protected String CODE_SUCCESS = "200";

    protected String CODE_FAILED = "500";



    protected Map<String, Object> success() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CODE_SUCCESS);
        result.put("message","操作成功");
        return result;
    }

    protected Map<String, Object> success(Object ret) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CODE_SUCCESS);
        result.put("message","操作成功");
		result.put("data", ret);
        return result;
    }

    protected Map<String, Object> error() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CODE_FAILED);
        result.put("message","系统维护！");
        return result;
    }

    protected Map<String, Object> failed(String msg) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CODE_FAILED);
        result.put("message", msg);
        return result;
    }

    protected Map<String, Object> failed() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CODE_FAILED);
        result.put("message", "操作失败，请稍后再试!");
        return result;
    }
}
