package com.exam.controller;

import com.exam.entity.Admin;
import com.exam.entity.ApiResult;
import com.exam.serviceimpl.AdminServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员操作
 */
@RestController
public class AdminController {

    private AdminServiceImpl adminService;

    public AdminController(AdminServiceImpl adminService){
        this.adminService = adminService;
    }

    /**
     * 查询全部admin用户信息
     * @return
     */
    @GetMapping("/admins")
    public ApiResult findAll(){
        System.out.println("查询全部");
        return ApiResultHandler.success(adminService.findAll());
    }

    /**
     * 根据id查询admin用户信息
     * @param adminId
     * @return
     */
    @GetMapping("/admin/{adminId}")
    public ApiResult findById(@PathVariable("adminId") Integer adminId){
        System.out.println("根据ID查找");
        return ApiResultHandler.success(adminService.findById(adminId));
    }

    /**
     * 根据id删除admin用户信息
     * @param adminId
     * @return
     */
    @DeleteMapping("/admin/{adminId}")
    public ApiResult deleteById(@PathVariable("adminId") Integer adminId){
        adminService.deleteById(adminId);
        return ApiResultHandler.success();
    }

    /**
     * 根据id更新admin用户信息
     * @param adminId
     * @param admin
     * @return
     */
    @PutMapping("/admin/{adminId}")
    public ApiResult update(@PathVariable("adminId") Integer adminId, Admin admin){
        return ApiResultHandler.success(adminService.update(admin));
    }

    /**
     * 新增admin用户信息
     * @param admin
     * @return
     */
    @PostMapping("/admin")
    public ApiResult add(Admin admin){
        return ApiResultHandler.success(adminService.add(admin));
    }
}
