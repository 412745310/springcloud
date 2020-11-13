package com.chelsea.springcloud_server.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chelsea.springcloud_server.domain.ResultVO;
import com.chelsea.springcloud_server.domain.Student;
import com.google.common.collect.Maps;

@RestController
public class ServerController {
	
	@Value("${server.port}")
	private String port;

	@RequestMapping("/home/{name}")
	public String home(@PathVariable String name) {
		return "hi " + name + ", from port:" + port;
	}
	
	@RequestMapping("/test")
	public ResultVO test() {
	    Student student = new Student();
	    student.setId("1");
	    student.setName("zhangsan");
	    List<Student> details = new ArrayList<>();
	    details.add(student);
	    Map<String, Object> map = Maps.newHashMap();
	    map.put("dataList", details.get(0));
	    map.put("time", "2020-11-13");
	    return ResultVO.builder().status(0).message("调用成功").data(map).build();
	}
}
