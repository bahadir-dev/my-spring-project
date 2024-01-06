package com.bahd.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.bahd.controller.CourseController.*(..))")
    private void pointcut(){}

    @Before("pointcut()")
    public void log(){
        logger.info("Logger info --------");
    }

}
