package com.chelsea.springcloud_consul_client1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("say-hello/{name}")
	public String sayHello(@PathVariable("name")String name){
		return "hello " + name;
	}
	
}
