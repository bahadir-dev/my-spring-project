package com.bahd.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    @Bean(name = "first")
    public String str1(){
        return "Welcome to CydeoApp!";
    }

    @Bean("second")
    public String str2(){
        return "Spring Core Practice!";
    }
}
