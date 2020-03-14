package com.lvkheen.parking.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.lvkheen.parking.controller.*.*(..))")
    private void forControllers(){}

    @Pointcut("execution(* com.lvkheen.parking.dao.*.*(..))")
    private void forDao(){}

    @Pointcut("execution(* com.lvkheen.parking.service.*.*(..))")
    private void forServices(){}

    @Pointcut("forControllers() || forDao() || forServices()")
    private void forAll(){}

    @Before("forAll()")
    public void before(JoinPoint joinPoint){
        Logger logger = Logger.getLogger(getClass().getName());
        String method = joinPoint.getSignature().toShortString();
        Object[] arguments = joinPoint.getArgs();

        logger.info(">>>>>> @BEFORE IS CALLING METHOD: " + method);

        for (Object obj : arguments){
            logger.info(">>> ARGUMENTS: " + obj);
        }

    }

}
