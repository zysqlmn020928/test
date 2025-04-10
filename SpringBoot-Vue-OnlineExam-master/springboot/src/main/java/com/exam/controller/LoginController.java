package com.exam.controller;

import com.exam.entity.*;
import com.exam.serviceimpl.LoginServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


/**
 * 登陆接口
 */
@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    /**
     * 登陆校验
     * @param login
     * @return
     */
    @PostMapping("/login")
    public ApiResult login(@RequestBody Login login) throws ExecutionException, InterruptedException {

        Integer username = login.getUsername();
        String password = login.getPassword();
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        Future<Admin> adminRes = loginService.adminLogin(username, password);
        if (adminRes.get() != null) {
            return ApiResultHandler.buildApiResult(200, "请求成功", adminRes.get());
        }

        Future<Teacher> teacherRes = loginService.teacherLogin(username,password);
        if (teacherRes.get() != null) {
            return ApiResultHandler.buildApiResult(200, "请求成功", teacherRes.get());
        }

        Future<Student> studentRes = loginService.studentLogin(username,password);
        if (studentRes.get() != null) {
            return ApiResultHandler.buildApiResult(200, "请求成功", studentRes.get());
        }
        stopWatch.stop();
        System.out.println("所有任务总耗时（毫秒）：" + stopWatch.getTotalTimeMillis());
        return ApiResultHandler.buildApiResult(400, "请求失败", null);

    }
}
