package com.ift.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author liufei
 * @since 2019/10/10
 */
public class WinCondition implements Condition {

    /**
     * @param context  判断条件可以使用的上下文环境
     * @param metadata 注解的信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if (osName != null && osName.toLowerCase().startsWith("win")) {
            return true;
        }
        return false;
    }
}
