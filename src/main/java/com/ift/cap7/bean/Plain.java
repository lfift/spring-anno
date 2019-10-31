package com.ift.cap7.bean;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Component
public class Plain implements EnvironmentAware {

    private Environment environment;
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    public Environment getEnvironment() {
        return this.environment;
    }
}
