package com.chelsea.springcloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	
	@Value("${foo}")
	String foo;
	
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
	
}
