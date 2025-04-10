package com.exam.entity;

import lombok.Data;

/**
 * 教师实体类
 */
@Data
public class Teacher {
    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 教师姓名
     */
    private String teacherName;
    /**
     * 学院
     */
    private String institute;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 身份证号
     */
    private String cardId;

    /**
     * 职称
     */
    private String type;

    /**
     * 角色
     */
    private String role;
}