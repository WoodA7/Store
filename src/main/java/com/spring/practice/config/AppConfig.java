package com.spring.practice.config;

import com.spring.practice.repository.CategoryRepository;
import com.spring.practice.repository.CategoryRepositoryImpl;
import com.spring.practice.repository.ItemRepository;
import com.spring.practice.repository.ItemRepositoryImpl;
import com.spring.practice.services.ItemService;
import com.spring.practice.services.ItemServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.practice")
public class AppConfig {

    @Bean
    public CategoryRepository categoryRepository(){
        return new CategoryRepositoryImpl();
    }

    @Bean
    public ItemService itemService(){
        return new ItemServiceImpl();
    }

    @Bean
    public ItemRepository itemRepository(){
        return new ItemRepositoryImpl();
    }

}
