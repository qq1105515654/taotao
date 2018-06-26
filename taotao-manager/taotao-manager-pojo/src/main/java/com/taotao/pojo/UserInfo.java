package com.taotao.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author：盛年华
 * @Date：2018/6/26 17:16
 * @Description:
 */
@Table(name = "tb_user")
public class UserInfo extends  BaseEntity {

    /**
     * 用户名
     */
    @Column(name = "username")
    private String userName;

    /**
     * 密码加密处理
     */
    @Column(name = "password")
    private String password;

    /**
     * 注册手机号码
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 注册邮箱
     */
    @Column(name = "email")
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
