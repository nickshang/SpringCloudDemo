package com.shang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Think on 2017/6/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserverConfigClientRefresh {
    public static void main(String[] args) {
        SpringApplication.run(MicroserverConfigClientRefresh.class, args);
    }
}
