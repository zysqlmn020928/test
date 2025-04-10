package com.exam.entity;

import lombok.Data;

// 选择题实体
@Data
public class MultiQuestion {

    /**
     * 试题编号
     */
    private Integer questionId;

    /**
     * 考试科目
     */
    private String subject;

    /**
     * 所属章节
     */
    private String section;

    /**
     * 选项A
     */
    private String answerA;

    /**
     * 选项B
     */
    private String answerB;

    /**
     * 选项C
     */
    private String answerC;

    /**
     * 选项D
     */
    private String answerD;

    /**
     * 问题题目
     */
    private String question;

    /**
     * 难度等级
     */
    private String level;

    /**
     * 正确答案
     */
    private String rightAnswer;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 分数
     */
    private Integer score;

}