package com.example.crud.config;

import com.example.crud.repository.StaffDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    public StaffDao staffDao(){
        return new StaffDao("staff.csv");
    }
}
