package com.shang.cloud.microservice_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Think on 2017/5/31.
 */
@RestController
public class UserContoller {

//    @Autowired
//    private RestTemplate restTemplate;
//
//
//    //从配置文件获取连接
//    @Value("${user.userServicePath}")
//    private String userServicePath;
//
//    @GetMapping("/movie/{id}")
//    public User getUserById(@PathVariable Long id){
//        return this.restTemplate.getForObject(userServicePath + id,User.class);
//    }


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}


