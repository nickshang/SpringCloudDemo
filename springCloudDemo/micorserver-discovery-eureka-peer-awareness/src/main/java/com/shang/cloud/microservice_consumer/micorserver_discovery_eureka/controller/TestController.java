package com.shang.cloud.microservice_consumer.micorserver_discovery_eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Think on 2017/6/4.
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "test";
    }
}
