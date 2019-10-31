package com.ift.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author liufei
 * @since 2019/10/15
 */
public class Jeep implements InitializingBean, DisposableBean {

    public Jeep(){
        System.out.println(".....jeep constructor.....");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(".....jeep init(PostConstruct).....");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(".....jeep destroy(PreDestroy).....");
    }

    public void initMethod() {
        System.out.println(".....jeep initMethod.....");
    }
    public void destroyMethod() {
        System.out.println(".....jeep destroyMethod.....");
    }

    public void destroy() throws Exception {
        System.out.println(".....jeep destroy.....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(".....jeep afterPropertiesSet.....");
    }
}
