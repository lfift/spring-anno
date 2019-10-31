package com.ift;

import com.ift.cap8.bean.Bird;
import com.ift.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/16
 */
public class Cap8Test {

    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Bird bird = app.getBean(Bird.class);
        System.out.println(bird);
    }
}
