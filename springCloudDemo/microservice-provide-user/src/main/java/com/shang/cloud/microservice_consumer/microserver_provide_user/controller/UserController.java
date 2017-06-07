package com.shang.cloud.microservice_consumer.microserver_provide_user.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.shang.cloud.microservice_consumer.microserver_provide_user.entity.User;
import com.shang.cloud.microservice_consumer.microserver_provide_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 2017/5/30.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("serviceUrl")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICEPROVIDERUSER", false);
        return instance.getHomePageUrl();
    }


    @GetMapping("instance-info")
    public ServiceInstance instanceInfo() {
        return discoveryClient.getLocalServiceInstance();
    }



    @GetMapping("simple/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }

    @PostMapping("simpleByPost")
    public User findByIdByPost(@RequestBody  User user){
        user.setName( user.getName() +": china");
        return user;
    }

    @GetMapping("simpleByPost")
    public User findByIdByGet(@RequestBody  User user){
        user.setName( user.getName() +": china");
        return user;
    }


    @GetMapping("/list-all")
    public List<User> getLists(){
        List<User> list = new ArrayList<>();
        list.add(new User("11","11"));
        list.add(new User("22","22"));
        list.add(new User("33","33"));
        list.add(new User("44","44"));
        list.add(new User("55","55"));

        return list;
    }

}
