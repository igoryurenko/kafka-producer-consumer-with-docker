package com.iyurenko.kafka.test.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produceMessageToDefaultTopic(String key, String message) {
        kafkaTemplate.sendDefault(key, message);
        kafkaTemplate.flush();
    }

}