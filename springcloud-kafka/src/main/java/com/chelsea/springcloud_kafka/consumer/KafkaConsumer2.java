package com.chelsea.springcloud_kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.chelsea.springcloud_kafka.messaging.MySink;

/**
 * 消费者
 * 
 * @author shevchenko
 *
 */
@EnableBinding(MySink.class)
public class KafkaConsumer2 {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer2.class);

    /**
     * 使用自定义通道接收消息
     * 
     * @param message
     */
    @StreamListener(MySink.INPUT)
    public void receive(String message) {
        logger.info("KafkaConsumer2 receive message : " + message);
    }

}
