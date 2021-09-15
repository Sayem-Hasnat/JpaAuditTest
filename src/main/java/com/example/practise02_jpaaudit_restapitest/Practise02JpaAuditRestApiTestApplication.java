package com.example.practise02_jpaaudit_restapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Practise02JpaAuditRestApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Practise02JpaAuditRestApiTestApplication.class, args);
    }

}
