package com.chelsea.springcloud_client_feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chelsea.springcloud_client_feign.service.impl.HelloServiceHystrix;

@FeignClient(value = "springcloud-server", fallback=HelloServiceHystrix.class)
public interface HelloService {
	
	@RequestMapping("/home/{name}")
    String sayHello(@PathVariable(value = "name") String name);
	
}
