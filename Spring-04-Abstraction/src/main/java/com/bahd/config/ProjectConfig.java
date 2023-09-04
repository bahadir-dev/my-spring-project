package com.bahd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.bahd")
@ComponentScan(basePackages = {"com.bahd.proxy","com.bahd.service","com.bahd.repository"})
public class ProjectConfig {
}
