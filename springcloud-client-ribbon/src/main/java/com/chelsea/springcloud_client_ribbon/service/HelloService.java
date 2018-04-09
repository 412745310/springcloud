package com.chelsea.springcloud_client_ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
    RestTemplate restTemplate;

	/**
	 * 设置断路由注解@HystrixCommand
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://springcloud-server/home/" + name,String.class);
    }
	
	public String hiError(String name) {
        return "sorry,"+name+",error!";
    }
	
}
