package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：盛年华
 * @Date：2018/6/26 9:34
 * @Description:
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/home")
    public String getJsp() {

        return testService.getJsp();
    }
}
