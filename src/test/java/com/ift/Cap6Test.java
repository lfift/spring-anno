package com.ift;

import com.ift.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class Cap6Test {

    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        System.out.println("IOC容器创建完成。。。。。");
        Object object = app.getBean("customFactoryBean");
        System.out.println(object.getClass());
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
