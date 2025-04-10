package com.exam.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 回复实体类
 */
@Data
public class Replay {
    /**
     * 留言id
     */
    private Integer messageId;

    /**
     * 回复编号
     */
    private Integer replayId;

    /**
     * 回复内容
     */
    private String replay;

    /**
     * 回复时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date replayTime;
}