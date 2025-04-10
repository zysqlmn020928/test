package com.exam.entity;

import lombok.Data;

/**
 * 登陆实体类
 */
@Data
public class Login {
    /**
     * 用户名
     */
    private Integer username;
    /**
     * 密码
     */
    private String password;

}
