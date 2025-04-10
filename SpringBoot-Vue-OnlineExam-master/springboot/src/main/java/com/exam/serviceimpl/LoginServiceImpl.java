package com.exam.serviceimpl;

import com.exam.entity.Admin;
import com.exam.entity.Student;
import com.exam.entity.Teacher;
import com.exam.mapper.LoginMapper;
import com.exam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Async("taskExecutor")
    @Override
    public Future<Admin> adminLogin(Integer username, String password) {
        return new AsyncResult<>(loginMapper.adminLogin(username,password));
    }

    @Async("taskExecutor")
    @Override
    public Future<Teacher> teacherLogin(Integer username, String password) {
        return new AsyncResult<>(loginMapper.teacherLogin(username,password));
    }

    @Async("taskExecutor")
    @Override
    public Future<Student> studentLogin(Integer username, String password) {
        return new AsyncResult<>(loginMapper.studentLogin(username,password));
    }
}
