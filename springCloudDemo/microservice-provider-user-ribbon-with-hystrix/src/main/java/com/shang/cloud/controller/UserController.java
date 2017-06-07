package com.shang.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.shang.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Think on 2017/6/3.
 */
@RestController
public class UserController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    // 直接使用Ribbon的API
    // 官方推荐默认情况下：不用配置隔离策略
    @GetMapping("/simple/{id}")
    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
    })
    public User getUserById(@PathVariable Long id ){
        return this.restTemplate.getForObject("http://MICROSERVICEPROVIDERUSER/simple/" + id,User.class);
    }

    public User fallback(Long id){
        return new User();
    }


//    @GetMapping("test")
//    public String test(){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("MICROSERVICEPROVIDERUSER");
//        System.out.println("1:" + serviceInstance.getHost() + " servcie id:" + serviceInstance.getServiceId() +" " +serviceInstance.getPort());
//
////        ServiceInstance serviceInstance2 = loadBalancerClient.choose("MICROSERVICEPROVIDERUSER2");
////        System.out.println("2:" + serviceInstance2.getHost() + " servcie id:" + serviceInstance2.getServiceId() +" " +serviceInstance2.getPort());
//
//        return "test";
//    }
}
