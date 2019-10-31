package com.ift.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author liufei
 * @since 2019/10/15
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(".....postProcessBeforeInitialization.." + beanName + "..." + bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(".....postProcessAfterInitialization.." + beanName + "..." + bean);
        return bean;
    }
}
