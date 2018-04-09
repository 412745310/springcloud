package com.chelsea.springcloud_zipkin_client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/sayhello1")
	public String sayHello(){
		return restTemplate.getForObject("http://localhost:8771/sayhello2", String.class);
	}
	
	@RequestMapping("/sayinfo1")
	public String sayInfo(){
		return "sayinfo1";
	}
	
}
