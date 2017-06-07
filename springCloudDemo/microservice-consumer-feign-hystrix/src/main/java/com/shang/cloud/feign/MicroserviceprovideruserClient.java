package com.shang.cloud.feign;

import com.shang.cloud.entity.User;
import com.shang.config.HystrixClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Think on 2017/6/3.
 * 1.使用Spring MVC 注解
 * 2.使用name定义服务名
 */

@FeignClient( name="MICROSERVICEPROVIDERUSER",configuration = com.shang.config.FeignClientConfigurationDefault.class, fallback = HystrixClientFallback.class)
public interface MicroserviceprovideruserClient {


    // 注意:1.GetMapping不支持；2.PathVariable需要设置value
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") long id);


    // 只要参数是复杂对象，即使指定了GET方法，feign依然会以POST方法进行发送请求
    // 测试Post请求
    @RequestMapping(value="//impleByPost",method = RequestMethod.POST)
    public User getUserByPost(User user);


}




