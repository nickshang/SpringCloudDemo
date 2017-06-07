package com.shang.cloud.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.shang.cloud.ExcludeFromCompentedScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by Think on 2017/6/3.
 */
@ExcludeFromCompentedScan
public class RibbonConfig {
    @Autowired
    private IClientConfig iClientConfig;

    @Bean
    public IRule ribbonRue(IClientConfig iClientConfig){
        return new RandomRule();
    }
}
