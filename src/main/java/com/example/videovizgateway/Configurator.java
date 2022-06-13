package com.example.videovizgateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurator {

    @Bean
    public LoggingFilter loggingFilter(){
        return new LoggingFilter();
    }
}
