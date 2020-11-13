package com.chelsea.springcloud_client_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chelsea.springcloud_client_ribbon.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    
    @RequestMapping(value = "/hello/{name}")
    public String hi(@PathVariable String name){
        return helloService.hiService(name);
    }
    
    @RequestMapping(value = "/hello/test")
    public void test(){
        helloService.test();
    }
    
}
