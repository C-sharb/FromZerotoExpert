package com.learn.fromzerotoexpert.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/FromZerotoExpert")
    public String Test(){
        return "嗨，欢迎您来到 from zero to expert.";
    }
}
