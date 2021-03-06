package com.shang.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Think on 2017/7/3.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/")
    public String get(){
        return this.profile;
    }
}
