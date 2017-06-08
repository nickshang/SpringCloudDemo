package com.shang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
@EnableHystrixDashboard
public class MicroserviceconsumerFeignHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceconsumerFeignHystrixDashboardApplication.class, args);
	}
}
