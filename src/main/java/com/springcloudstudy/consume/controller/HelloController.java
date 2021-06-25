package com.springcloudstudy.consume.controller;

import com.springcloudstudy.consume.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

 /*   @Value("${springcloud.hello}")
    private String hello;*/

    @RequestMapping("/hello/{name}")
    public String index(
            @PathVariable("name") String name
    ) {
        return helloRemote.hello(name);
    }

    /*@RequestMapping("/config")
    public String config() {
        return "spring-cloud-config:" + hello;
    }*/

}
