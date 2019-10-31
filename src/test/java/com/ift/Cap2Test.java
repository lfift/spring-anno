package com.ift;

import com.ift.cap2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class Cap2Test {

    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
