package com.taotao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author：盛年华
 * @Date：2018/6/26 10:01
 * @Description:  视图适配器,与静态资源映射
 */
@Configuration
@EnableWebMvc
public class MyWebAdapter extends WebMvcConfigurerAdapter {

    /**
     *
     * 功能描述: 给web页面添加路径
     *
     * @param:
     * @return:
     * @auther: 盛年华
     * @date: 2018/6/28 11:57
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/shops").setViewName("shops_index");
        registry.addViewController("/product").setViewName("add_product");
        registry.addViewController("/administrator").setViewName("administrator_list");
        registry.addViewController("/advertisingl").setViewName("Advertising_list");
        registry.addViewController("/advertisings").setViewName("Advertising_sort");
        registry.addViewController("/article").setViewName("Article_list");
        registry.addViewController("/brand").setViewName("Brand_Manage");
        registry.addViewController("/columns").setViewName("Columns");
        registry.addViewController("/feedback").setViewName("feedback");
        registry.addViewController("/form").setViewName("form_builder");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/member").setViewName("member_list");
        registry.addViewController("/order").setViewName("Order");
        registry.addViewController("/orderc").setViewName("Order_Chart");
        registry.addViewController("/orderf").setViewName("Order_form");
        registry.addViewController("/orderl").setViewName("Order_Logistics");
        registry.addViewController("/page").setViewName("page_list");
        registry.addViewController("/payc").setViewName("Payment_Configure");
        registry.addViewController("/paym").setViewName("payment_method");
        registry.addViewController("/personal").setViewName("Personal_info");
        registry.addViewController("/products").setViewName("Products");
        registry.addViewController("/refund").setViewName("Refund");
        registry.addViewController("/rizhi").setViewName("rizhi_list");
        registry.addViewController("/systemo").setViewName("system_columns");
        registry.addViewController("/systemi").setViewName("system_info");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     *
     * 功能描述:  给静态资源添加映射路径
     *
     * @param:
     * @return:
     * @auther: 盛年华
     * @date: 2018/6/28 11:58
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/js/dist/**").addResourceLocations("classpath:/static/js/dist/");
        super.addResourceHandlers(registry);
    }
}
