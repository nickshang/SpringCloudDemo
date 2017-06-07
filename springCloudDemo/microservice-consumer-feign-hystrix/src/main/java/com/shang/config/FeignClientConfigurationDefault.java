package com.shang.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Think on 2017/6/5.
 */
@Configuration
public class FeignClientConfigurationDefault {

    @Bean
    Logger.Level feignLoggerLevel() {
        System.out.println("------------------------------------------------------------------------------");
        return Logger.Level.FULL;
    }

}
