package com.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * TODO 注意：@Reference 包信息是 com.alibaba.dubbo.config.annotation.Reference;
     */
    @Reference
    private UserService userService;

    @RequestMapping("showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }

}
