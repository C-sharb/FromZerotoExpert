package com.learn.fromzerotoexpert.controller;


import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {
    /**
     * 利用@CookieValue注解记录cookie
     * @param userHasVisited
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/FromZerotoExpert")
    //设置默认Cookie并以"userHasVisited"-"false"的键值对进行存放
    public String Test(@CookieValue(value = "userHasVisited",defaultValue = "false")String userHasVisited,HttpServletResponse httpServletResponse){
        if(userHasVisited.equals("false")){
            Cookie cookie = new Cookie("userHasVisited","true");
            //设置cookie有效时间为一天
            cookie.setMaxAge(24*60*60);
            httpServletResponse.addCookie(cookie);
            return "嗨，欢迎您来到 from zero to expert.";
        }

        return "嗨，欢迎您再次来到 from zero to expert.";
    }

    /**
     * 利用HttpServletRequest获取所有cookie
     * @param request
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/FromZerotoExpert2")
    public String Test1(HttpServletRequest request,HttpServletResponse httpServletResponse){
        Cookie[] cookies = request.getCookies();
        //判断所获得的cookies是否为空
        if(cookies != null){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userHasVisited2") && cookie.getValue().equals("true")) {
                    return "嗨，欢迎您再次到 from zero to expert.";
                }
            }
        }
        Cookie cookieNew = new Cookie("userHasVisited2", "true");
        //设置cookie有效时间为一天
        cookieNew.setMaxAge(24 * 60 * 60);
        httpServletResponse.addCookie(cookieNew);
        return "嗨，欢迎您来到 from zero to expert.";
    }
}
