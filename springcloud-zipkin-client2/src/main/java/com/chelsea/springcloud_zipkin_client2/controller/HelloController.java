package com.chelsea.springcloud_zipkin_client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/sayhello2")
	public String sayHello(){
		return restTemplate.getForObject("http://localhost:8770/sayinfo1", String.class);
	}
	
}
