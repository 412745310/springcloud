package com.chelsea.springcloud_kafka.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chelsea.springcloud_kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public boolean send(HttpServletRequest request, HttpServletResponse response) {
        String message = request.getParameter("message");
        boolean result = kafkaProducer.sendMessage(message);
        return result;
    }

}
