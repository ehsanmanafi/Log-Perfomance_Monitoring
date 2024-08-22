package com.log_generator.log_generator.logging.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Aspect
@Configuration
@Slf4j
public class AllServicesLoggingHandler {

    @Around(" com.log_generator.log_generator.logging.definition.pointCut.ApplicationPointCut.allServicesPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
    LocalDateTime startLocalDateTime = LocalDateTime.now();
    Object returnProceed = joinPoint.proceed();
    LocalDateTime endLocalDateTime = LocalDateTime.now();
        log.info("Process: " + joinPoint.toString() + " By User {Taken From Token} Start Time: " +
             startLocalDateTime.toString() + " End Time:" + endLocalDateTime.toString());
    return returnProceed;
}
}
