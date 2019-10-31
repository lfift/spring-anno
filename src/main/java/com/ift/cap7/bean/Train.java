package com.ift.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author liufei
 * @since 2019/10/15
 */
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println(".....train constructor.....");
    }

    public void destroy() throws Exception {
        System.out.println(".....train destroy.....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(".....train afterPropertiesSet.....");
    }
}
