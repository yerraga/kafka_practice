package com.kafkapractise.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "kafka_practise", groupId = "groupId")
    void listner(String data){
        System.out.println("Message received successfully "+ data );
    }
}
