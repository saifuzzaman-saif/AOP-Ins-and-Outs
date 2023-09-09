package com.saif.aop.app.introductions;

import org.springframework.stereotype.Component;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Component
public class DefaultEncoreable implements Encoreable{

    public void performEncore() {
        System.out.println("performing encoreable...");
    }
}
