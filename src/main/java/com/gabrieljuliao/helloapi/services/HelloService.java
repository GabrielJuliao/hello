package com.gabrieljuliao.helloapi.services;

import com.gabrieljuliao.helloapi.model.Hello;
import com.gabrieljuliao.helloapi.model.HttpMethod;
import org.springframework.stereotype.Service;
import se.emirbuc.randomsentence.RandomSentences;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class HelloService {
    public Hello hello(HttpMethod httpMethod) {
        return new Hello(httpMethod.name(), RandomSentences.generateRandomSentence(RandomSentences.Length.MEDIUM), new Timestamp(new Date().getTime()));
    }
}
