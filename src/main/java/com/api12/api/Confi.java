package com.api12.api;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    class AppConfig {
        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
    }


