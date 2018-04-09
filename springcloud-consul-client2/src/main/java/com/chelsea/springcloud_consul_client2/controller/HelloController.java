package com.chelsea.springcloud_consul_client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("say-hi/{name}")
	public String sayHi(@PathVariable("name")String name){
		return restTemplate.getForObject("http://springcloud-consul-client1/say-hello/" + name,String.class);
	}
	
}
