package com.chelsea.springcloud_client_feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chelsea.springcloud_client_feign.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return helloService.sayHello(name);
	}

}
