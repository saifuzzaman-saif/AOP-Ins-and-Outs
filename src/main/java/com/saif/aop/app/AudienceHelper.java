package com.saif.aop.app;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Component
@Aspect
@Order(1)
public class AudienceHelper {

    @Before("execution(* com.saif.aop.app.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats...");
    }
}
