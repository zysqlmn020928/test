package com.exam.controller;

import com.exam.entity.ApiResult;
import com.exam.entity.Replay;
import com.exam.serviceimpl.ReplayServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 回复信息管理
 */
@RestController
public class ReplayController {

    @Autowired
    private ReplayServiceImpl replayService;

    /**
     * 添加回复信息
     * @param replay
     * @return
     */
    @PostMapping("/replay")
    public ApiResult add(@RequestBody Replay replay) {
        int data = replayService.add(replay);
        if (data != 0) {
            return ApiResultHandler.buildApiResult(200,"添加成功！",data);
        } else {
            return ApiResultHandler.buildApiResult(400,"添加失败！",null);
        }
    }

    /**
     * 根据留言Id获取回复信息
     * @param messageId
     * @return
     */
    @GetMapping("/replay/{messageId}")
    public ApiResult findAllById(@PathVariable("messageId") Integer messageId) {
        List<Replay> res = replayService.findAllById(messageId);
        return ApiResultHandler.buildApiResult(200,"根据messageId查询",res);
    }
}
