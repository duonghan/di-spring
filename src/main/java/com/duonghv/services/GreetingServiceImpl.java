package com.duonghv.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_TEXT = "Hello - Original !!!";
    @Override
    public String sayGreeting() {
        return HELLO_TEXT;
    }
}
