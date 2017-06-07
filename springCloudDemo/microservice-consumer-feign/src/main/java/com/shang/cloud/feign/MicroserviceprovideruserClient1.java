package com.shang.cloud.feign;

import com.shang.cloud.entity.User;
import com.shang.config.FeignClientConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;


/**
 * Created by Think on 2017/6/3.
 * 1.使用configuration覆盖Feign的默认配置
 * 2.使用name定义服务名
 */

@FeignClient( name="MICROSERVICEPROVIDERUSER" ,configuration = FeignClientConfiguration.class)
public interface MicroserviceprovideruserClient1 {

//    @RequestLine("GET /simple/{id}")
    @RequestLine("GET /simple/{id}")
    public User getUser(@Param("id") long id);


//    @RequestLine("POST /simpleByPost")
    // 设置post有异常
    @RequestLine("GET /simple/{id}")
    public User getUserByPost(User user);

}
