package com.saif.aop.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
public class PerformanceImpl implements Performance{

    @Override
    public void startPerform() {
        perform();
    }

    @Override
    public boolean perform() {
        System.out.println("Performance running...");

        return true;
    }
}
