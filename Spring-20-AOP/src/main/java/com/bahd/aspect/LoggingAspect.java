package com.bahd.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Aspect
@Configuration
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.bahd.controller.CourseController.*(..))")
    private void pointcut(){}

//    @Before("pointcut()")
//    public void log(){
//        logger.info("Logger info --------");
//    }

    //both of above can be combined in this way
    @Before("execution(* com.bahd.controller.CourseController.*(..))")
    public void beforeAdvice(){
        logger.info("Logger info --------");
    }

    @Pointcut("execution(* com.bahd.repository.CourseRepository.findById(*))")
    private void anyProductRepositoryFindById(){}

    @Before("anyProductRepositoryFindById()")
    public void beforeCourseRepoOperation(JoinPoint joinPoint){
        logger.info("Before (findById): -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
    }

    //within
    @Pointcut("within(com.bahd.controller..*)")
    private void anyControllerOperation(){}

    @Pointcut("@within(org.springframework.stereotype.Service)")
    private void anyServiceOperation(){}

    @Before("anyControllerOperation() || anyServiceOperation()")
    public void beforeControllerAdvice(JoinPoint joinPoint){
        logger.info("Before (findById): -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    private void anyDeleteCourseOperation(){}

    @Before("anyDeleteCourseOperation()")
    public void beforeControllerAdvice2(JoinPoint joinPoint){
        logger.info("Before (findById): -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void anyGetCourseOperation(){}

//    @AfterReturning(pointcut = "anyGetCourseOperation()", returning = "result")
//    public void afterReturningContollerAdvice(JoinPoint joinPoint, Object result){
//        logger.info("After returning -> Method: {} - result:{]", joinPoint.getSignature().toShortString(), result.toString());
//    }

    //return list
    @AfterReturning(pointcut = "anyGetCourseOperation()", returning = "result")
    public void afterReturningContollerAdvice(JoinPoint joinPoint, List<Object> result){
        logger.info("After returning(List) -> Method: {} - result:{]", joinPoint.getSignature().toShortString(), result.toString());
    }

    @AfterThrowing(pointcut = "anyGetCourseOperation()", throwing = "exception")
    public void afterThrowingControllerAdvice(JoinPoint joinPoint, RuntimeException exception){
        logger.info("After returning -> Method: {} - Exception:{]", joinPoint.getSignature().toShortString(), exception.toString());
    }




}
