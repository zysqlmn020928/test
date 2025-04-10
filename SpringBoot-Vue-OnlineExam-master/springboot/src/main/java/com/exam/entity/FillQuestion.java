package com.exam.entity;

import lombok.Data;

//填空题实体类
@Data
public class FillQuestion {
    /**
     * 试题编号
     */
    private Integer questionId;

    /**
     * 考试科目
     */
    private String subject;

    /**
     * 试题内容
     */
    private String question;

    /**
     * 正确答案
     */
    private String answer;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 难度等级
     */
    private String level;

    /**
     * 所属章节
     */
    private String section;

    /**
     * 题目解析
     */
    private String analysis;
}
