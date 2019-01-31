package com.duonghv.services;

import org.springframework.stereotype.Repository;

public interface GreetingRepository{
    public String getEnglishGreeting();

    public String getSpanishGreeting();

    public String getGermanyGreeting();
}
