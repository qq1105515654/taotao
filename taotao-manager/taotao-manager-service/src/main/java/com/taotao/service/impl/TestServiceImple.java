package com.taotao.service.impl;

import com.taotao.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author：盛年华
 * @Date：2018/6/26 10:52
 * @Description:
 */
@Service
public class TestServiceImple  implements TestService {
    @Override
    public String getJsp() {
        return "redirect:/";
    }
}
