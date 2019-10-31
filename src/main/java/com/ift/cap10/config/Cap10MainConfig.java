package com.ift.cap10.config;

import com.ift.cap10.aop.LogAspects;
import com.ift.cap10.bean.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liufei
 * @since 2019/10/28
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {

    @Bean
    public Calculator calculator() {

        return new Calculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
