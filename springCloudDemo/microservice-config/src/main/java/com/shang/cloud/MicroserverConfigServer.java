package com.shang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Think on 2017/6/3.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MicroserverConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(MicroserverConfigServer.class, args);
    }
}
