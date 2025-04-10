package com.exam.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExamManage {
    /**
     * 考试编号
     */
    private Integer examCode;

    /**
     * 考试描述
     */
    private String description;

    /**
     * 课程名称
     */
    private String source;

    /**
     * 试卷编号
     */
    private Integer paperId;

    /**
     * 考试日期
     */
    private String examDate;

    /**
     * 持续时长
     */
    private Integer totalTime;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学期
     */
    private String term;

    /**
     * 专业
     */
    private String major;

    /**
     * 学院
     */
    private String institute;

    /**
     * 总分
     */
    private Integer totalScore;

    /**
     * 考试类型
     */
    private String type;

    /**
     * 考生须知
     */
    private String tips;
}