package com.saif.aop;

import com.saif.aop.app.Performance;
import com.saif.aop.app.soundsystem.CompactDisc;
import com.saif.aop.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Performance p = (Performance) ctx.getBean("performance");
        p.perform();

        CompactDisc cd = (CompactDisc) ctx.getBean("compactDisc");
        cd.play(1, "Saifuzzaman Saif");
    }
}
