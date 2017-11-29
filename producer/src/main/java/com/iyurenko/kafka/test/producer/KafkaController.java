package com.iyurenko.kafka.test.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/produce")
    public void produce(@RequestParam("message") String message,
                        @RequestParam(value = "key", required = false) String key) {
        kafkaService.produceMessageToDefaultTopic(key, message);
    }

}
