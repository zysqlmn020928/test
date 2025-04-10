package com.exam.entity;

import lombok.Data;

import java.util.Date;

/**
 * 分数实体类
 */
@Data
public class Score {

    /**
     * 分数编号
     */
    private Integer scoreId;
    /**
     * 考试编号
     */
    private Integer examCode;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 课程名称
     */
    private String subject;

    /**
     * 平时成绩
     */
    private Integer ptScore;

    /**
     * 期末成绩
     */
    private Integer etScore;

    /**
     * 总成绩
     */
    private Integer score;

    /**
     * 答题日期
     */
    private String answerDate;
}