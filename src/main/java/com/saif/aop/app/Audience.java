package com.saif.aop.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Aspect
@Order(2)
public class Audience {

    @Pointcut("execution(** Performance.perform(..)) && !bean('admin')")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones...");
    }

    @AfterReturning(pointcut = "performance()", returning = "ret")
    public void clap(Object ret) {
        System.out.println("CLAP CLAP!!!");
        System.out.println("returned result is : " + ret);
    }

    @After("performance()")
    public void complete() {
        System.out.println("performance completed.");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding refund..");
    }

    @Around("performance()")
    public boolean trackPerformance(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before performance...");

        Object ret = jp.proceed();

        System.out.println("after performance...");

        return (boolean) ret;
    }
}
