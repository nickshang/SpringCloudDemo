package com.shang.cloud;

import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatewayZuulApplication.class, args);
	}


	@Bean
	public PreZuulFilter preZuulFilter(){
		return new PreZuulFilter();
	}

	/**
	 * You can provide convention between serviceId and routes using regexmapper.
	 * It uses regular expression named groups to extract variables from serviceId and inject them into a route pattern.
	 *
	 * This means that a serviceId "myusers-v1" will be mapped to route "/v1/myusers/**".
	 *
	 * 访问连接url:http://localhost:7903/v1/microserviceprovideruser/simple/1
	 * @return
	 */
	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
	}

}
