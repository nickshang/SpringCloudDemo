package com.shang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Think on 2017/6/3.
 */
@SpringBootApplication
@EnableEurekaClient
public class Microserver_provide_user {

    public static void main(String[] args) {
        SpringApplication.run(Microserver_provide_user.class, args);
    }
}
