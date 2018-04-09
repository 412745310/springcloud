package com.chelsea.springcloud_kafka.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义输入通道
 * 
 * @author shevchenko
 *
 */
public interface MySink {

    String INPUT = "myInput";

    @Input(MySink.INPUT)
    SubscribableChannel input();

}
