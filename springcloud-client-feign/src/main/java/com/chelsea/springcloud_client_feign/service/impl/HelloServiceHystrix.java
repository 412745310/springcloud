package com.chelsea.springcloud_client_feign.service.impl;

import org.springframework.stereotype.Component;

import com.chelsea.springcloud_client_feign.service.HelloService;

@Component
public class HelloServiceHystrix implements HelloService {

	@Override
	public String sayHello(String name) {
		return "sorry "+name;
	}

}
