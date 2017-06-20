package com.shang.cloud.microservice_consumer.microserver_provide_user.controller;

import com.google.common.io.Files;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.shang.cloud.microservice_consumer.microserver_provide_user.entity.User;
import com.shang.cloud.microservice_consumer.microserver_provide_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 2017/5/30.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("serviceUrl")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICEPROVIDERUSER", false);
        return instance.getHomePageUrl();
    }


    /**
     * 返回实例名称
     * @return
     */
    @GetMapping("instance-info")
    public ServiceInstance instanceInfo() {
        return discoveryClient.getLocalServiceInstance();
    }


    @GetMapping("simple/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }

    @PostMapping("simpleByPost")
    public User findByIdByPost(@RequestBody  User user){
        user.setName( user.getName() +": china");
        return user;
    }

    @GetMapping("simpleByGet")
    public User findByIdByGet(@RequestBody  User user){
        user.setName( user.getName() +": china");
        return user;
    }

    /**
     * 文件上传
     * 界面测试方式：http://localhost:7903/index.html
     * curl测试方式：curl -F "file=@文件名" localhost:7908/upfile
     * @return 上传文件的路径
     */
    @PostMapping("/upfile")
    public String upfile(@RequestPart(value = "file") MultipartFile file, @Validated User user, Errors errors) throws IOException {

        if(errors.hasErrors()){
           return errors.getAllErrors().get(0).getDefaultMessage();
        }

        File saveFile = new File(file.getOriginalFilename());
        FileCopyUtils.copy(file.getBytes(),saveFile);

        return  saveFile.getAbsolutePath();
    }

    @GetMapping("/list-all")
    public List<User> getLists(){
        List<User> list = new ArrayList<>();
        list.add(new User("11","11"));
        list.add(new User("22","22"));
        list.add(new User("33","33"));
        list.add(new User("44","44"));
        list.add(new User("55","55"));

        return list;
    }

}
