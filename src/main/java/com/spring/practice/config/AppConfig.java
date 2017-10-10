package com.spring.practice.config;

import com.spring.practice.repository.CategoryRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sit on 26.09.2017.
 */
@Configuration
@ComponentScan("com.spring.practice")
public class AppConfig {

    @Bean
    public CategoryRepositoryImpl categoryRepository(){
        return new CategoryRepositoryImpl();
    }

}
