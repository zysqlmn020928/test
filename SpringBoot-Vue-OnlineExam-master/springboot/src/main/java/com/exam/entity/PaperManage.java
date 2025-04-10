package com.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 试卷对应关系
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaperManage {
    /**
     * 试卷编号
     */
    private Integer paperId;

    /**
     * 题目类型
     */
    private Integer questionType;

    /**
     * 题目编号
     */
    private Integer questionId;


}