package com.shang.cloud.microservice_consumer.micorserver_discovery_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 单例服务
 * Created by Think on 2017/6/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class Micorserver_discovery_eureka {
    public static void main(String[] args) {
        SpringApplication.run(Micorserver_discovery_eureka.class,args);
    }
}
