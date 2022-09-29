package com.prueba.Calculator.tracer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.corp.calculator.TracerImpl;

@Configuration
public class LoggerConfig {

    @Bean
    public TracerImpl tracer() {
        return new TracerImpl();
    }
}