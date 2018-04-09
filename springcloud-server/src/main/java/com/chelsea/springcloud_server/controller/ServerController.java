package com.chelsea.springcloud_server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	@Value("${server.port}")
	private String port;

	@RequestMapping("/home/{name}")
	public String home(@PathVariable String name) {
		return "hi " + name + ", from port:" + port;
	}
}
