package com.kafkapractise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaPractiseApplication {
 private static final Logger log = LoggerFactory.getLogger(KafkaPractiseApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(KafkaPractiseApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args-> {
			for(int i = 1; i < 11; i++) {
				kafkaTemplate.send("kafka_practise", "Succesfully send message from producer :)😍" + i);
				Thread.sleep(2000);
			}
		};
	}

}
