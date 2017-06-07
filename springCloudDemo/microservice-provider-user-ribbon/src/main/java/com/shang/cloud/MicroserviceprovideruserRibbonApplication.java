package com.shang.cloud;

import com.shang.cloud.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="microserviceprovideruser-ribbon",configuration = RibbonConfig.class)
@ComponentScan( excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value=ExcludeFromCompentedScan.class)}) // 使用注解排除的方式将RibbonConfig类，放置在主上下文中
public class MicroserviceprovideruserRibbonApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceprovideruserRibbonApplication.class, args);
	}
}
