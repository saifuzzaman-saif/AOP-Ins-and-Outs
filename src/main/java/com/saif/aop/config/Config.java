package com.saif.aop.config;

import com.saif.aop.app.Admin;
import com.saif.aop.app.Audience;
import com.saif.aop.app.Performance;
import com.saif.aop.app.PerformanceImpl;
import com.saif.aop.app.soundsystem.CompactDisc;
import com.saif.aop.app.soundsystem.SgtPeppers;
import com.saif.aop.app.soundsystem.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.saif.aop.app")
public class Config {

    @Bean
    public Performance performance() {
        return new PerformanceImpl();
    }

    @Bean(name = "aud")
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Admin admin() {
        return new Admin(performance());
    }

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public TrackCounter trackCounter() {
        TrackCounter trackCounter = new TrackCounter();
        trackCounter.setCounter(new HashMap<>());

        return trackCounter;
    }
}
