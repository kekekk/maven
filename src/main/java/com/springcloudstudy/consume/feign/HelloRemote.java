package com.springcloudstudy.consume.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author admin
 */
@FeignClient(name = "spring-cloud-producer" , fallback = HelloRemoteFallBack.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String hello(
      @RequestParam(value = "name") String name
    );
}

