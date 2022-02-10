package com.kafka.springbootkafkajson.service;

import com.kafka.springbootkafkajson.models.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "user_json";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public String sendMessage(User user) {
        kafkaTemplate.send(TOPIC, new User(user.getUserId(), user.getFirstName(), user.getLastName()));
        return "Message published successfully";
    }

}