package com.ncu.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ncu.Models.Movie;


@Service
public class KafkaConsumerListener {

	private static final String TOPIC = "kafka_rio";

    @KafkaListener(topics = TOPIC, groupId="group101", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Movie movie) {
        System.out.println("Consumed JSON Message: " + movie);
    }
}
