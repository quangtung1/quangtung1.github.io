package com.example.demospring.config;
import com.example.demospring.repository.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepoConfig {

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }
}
