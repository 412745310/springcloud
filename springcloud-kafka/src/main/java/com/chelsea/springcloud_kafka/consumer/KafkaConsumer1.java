package com.chelsea.springcloud_kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 消费者
 * 
 * @author shevchenko
 *
 */
@EnableBinding(Sink.class)
public class KafkaConsumer1 {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer1.class);

    /**
     * 使用默认通道接收消息
     * 
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void receive(String message) {
        logger.info("KafkaConsumer1 receive message : " + message);
    }

}
