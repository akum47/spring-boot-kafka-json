package com.kafka.springbootkafkajson.service;

import com.kafka.springbootkafkajson.models.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "user_json", groupId = "group_id")
    public void consume(User user) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", user));
    }
}