package com.kakaohealthcare.karechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class KarechatSkillServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KarechatSkillServerApplication.class, args);
    }
}
