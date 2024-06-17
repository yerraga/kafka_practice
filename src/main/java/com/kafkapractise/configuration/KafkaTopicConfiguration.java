package com.kafkapractise.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {


/**
 * Here we will create a topic with name
 */
@Bean
public NewTopic kafkaConfig(){

        return TopicBuilder.name("kafka_practise").build();
    }
}
