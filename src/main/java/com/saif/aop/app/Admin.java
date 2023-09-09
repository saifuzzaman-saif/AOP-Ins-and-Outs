package com.saif.aop.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Component
public class Admin {

    private Performance performance;

    public Admin(Performance performance) {
        this.performance = performance;
    }

    public void doPerform() {
        performance.perform();
    }
}
