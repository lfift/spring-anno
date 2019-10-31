package com.ift.cap9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author liufei
 * @since 2019/10/17
 */
@Component
public class Light implements ApplicationContextAware, BeanFactoryAware, BeanNameAware, EmbeddedValueResolverAware {

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory:" + beanFactory);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext: " + applicationContext);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result = resolver.resolveStringValue("os.name:${os.name},20-2=#{20-2}");
        System.out.println(result);
    }

    public void setBeanName(String name) {
        System.out.println(name);
    }
}
