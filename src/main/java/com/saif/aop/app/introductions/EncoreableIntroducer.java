package com.saif.aop.app.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value = "com.saif.aop.app.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
