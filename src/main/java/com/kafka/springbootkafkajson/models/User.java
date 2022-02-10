package com.kafka.springbootkafkajson.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private long userId;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User [userId=" + userId + ", firstName="
                + firstName + ", lastName=" + lastName + "]";
    }
}