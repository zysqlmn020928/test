package com.exam.service;

import com.exam.entity.Admin;
import com.exam.entity.Student;
import com.exam.entity.Teacher;

import java.util.concurrent.Future;

public interface LoginService {

    public Future<Admin> adminLogin(Integer username, String password);

    public Future<Teacher> teacherLogin(Integer username, String password);

    public Future<Student> studentLogin(Integer username, String password);
}
