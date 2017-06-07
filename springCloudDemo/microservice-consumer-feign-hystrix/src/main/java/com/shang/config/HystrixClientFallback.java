package com.shang.config;

/**
 * Created by Think on 2017/6/6.
 */

import com.shang.cloud.entity.User;
import com.shang.cloud.feign.MicroserviceprovideruserClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HystrixClientFallback implements MicroserviceprovideruserClient {

    @Override
    public User getUser(@PathVariable("id") long id) {
        User user = new User();
        user.setName("fial");
        return user;
    }

    @Override
    public User getUserByPost(User user) {
        user.setName("fial");
        return user;
    }
}
