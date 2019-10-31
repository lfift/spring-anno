package com.ift.cap6.config;

import com.ift.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author liufei
 * @since 2019/10/11
 */
public class CustomFactoryBean implements FactoryBean<Monkey> {

    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
