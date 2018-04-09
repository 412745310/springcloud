package com.chelsea.springcloud_kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;

/**
 * 生产者
 * 
 * @author shevchenko
 *
 */
@EnableBinding(Source.class)
public class KafkaProducer {

    @Autowired
    private Source source;

    /**
     * 使用默认通道发送消息
     * 
     * @param message
     * @return
     */
    public boolean sendMessage(String message) {
        return source.output().send(MessageBuilder.withPayload(message).build());
    }

}
