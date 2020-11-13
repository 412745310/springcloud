package com.chelsea.springcloud_client_ribbon.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chelsea.springcloud_client_ribbon.domain.ResultVO;
import com.chelsea.springcloud_client_ribbon.domain.Student;
import com.chelsea.springcloud_client_ribbon.util.RestRemplateUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
    RestTemplate restTemplate;

	/**
	 * 设置断路由注解@HystrixCommand
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://springcloud-server/home/" + name,String.class);
    }
	
	public String hiError(String name) {
        return "sorry,"+name+",error!";
    }
	
	public void test() {
	    ResultVO resultVO = RestRemplateUtils.postForEntity(restTemplate, "http://springcloud-server/test/", null, ResultVO.class);
	    Map<String, Object> map = (Map<String, Object>) resultVO.getData();
	    Map<String, Object> studentMap = (Map<String, Object>) map.get("dataList");
	    String time = (String) map.get("time");
	    System.out.println((String) studentMap.get("id"));
	    System.out.println((String) studentMap.get("name"));
	    System.out.println(time);
	}
	
}
