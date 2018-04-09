package com.chelsea.springcloud_kafka.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义输出通道
 * 
 * @author shevchenko
 *
 */
public interface MySource {

    String OUTPUT = "output";

    @Output(MySource.OUTPUT)
    MessageChannel output();

}
