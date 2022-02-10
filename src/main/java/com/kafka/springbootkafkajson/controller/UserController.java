package com.kafka.springbootkafkajson.controller;

import com.kafka.springbootkafkajson.models.User;
import com.kafka.springbootkafkajson.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class UserController {

    @Autowired
    private final Producer producer;

    @PostMapping("/publish")
    public String postJsonMessage(@RequestBody User user) {
        return producer.sendMessage(user);
    }
}