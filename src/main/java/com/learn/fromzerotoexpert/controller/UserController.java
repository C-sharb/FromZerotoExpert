package com.learn.fromzerotoexpert.controller;

import com.learn.fromzerotoexpert.Service.UserService;
import com.learn.fromzerotoexpert.common.ApiRestResponse;
import com.learn.fromzerotoexpert.exception.FZEException;
import com.learn.fromzerotoexpert.exception.FZEExceptionEnum;
import com.learn.fromzerotoexpert.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 */

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ApiRestResponse register(@RequestParam("username") String userName,@RequestParam("password") String password) throws FZEException {
        if(StringUtils.isEmpty(userName)){
            return ApiRestResponse.error(FZEExceptionEnum.NEED_USER_NAME);
        }
        if(StringUtils.isEmpty(password)){
            return ApiRestResponse.error(FZEExceptionEnum.NEED_PASSWORD);
        }

        userService.register(userName,password);
        return ApiRestResponse.success();
    }
}
