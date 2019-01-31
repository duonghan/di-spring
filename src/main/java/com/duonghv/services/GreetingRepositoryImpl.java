package com.duonghv.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Servicio de Saludo Primario";
    }

    @Override
    public String getGermanyGreeting() {
        return "Hallo - Primärer Begrüßungsdienst";
    }
}
