package com.log_generator.log_generator.logging.definition.pointCut;

import org.aspectj.lang.annotation.Pointcut;

public class ApplicationPointCut {
    @Pointcut("execution(* com.log_generator.log_generator.service.GeneratorService.*(..))")
    public void generatorServicePointCut() {}


    @Pointcut("generatorServicePointCut()")
    public void allServicesPointCut(){}

    @Pointcut("@annotation(com.log_generator.log_generator.logging.definition.annotation.LoggingSomeData)")
    public void LoggingSomeDataPointCut(){}
}
