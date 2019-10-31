package com.ift;

import com.ift.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class Cap4Test {

    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        System.out.println("IOC容器创建完成。。。。。");
        app.getBean("person");
    }
}
