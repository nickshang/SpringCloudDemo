package com.shang.cloud.controller;

import com.shang.cloud.entity.User;
import com.shang.cloud.feign.MicroserviceprovideruserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Think on 2017/6/3.
 */
@RestController
public class UserController {

    @Autowired
    private MicroserviceprovideruserClient microserviceprovideruserClient;

    @RequestMapping(value = "testGetUser/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable long id){
        User user = this.microserviceprovideruserClient.getUser(id);
        return user;
    }

    @PostMapping(value="postGetUser")
    public User getUserByPost(User user){
        return this.microserviceprovideruserClient.getUserByPost(user);
    }



}
