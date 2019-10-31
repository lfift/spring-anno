package com.ift;

import com.ift.cap1.Person;
import com.ift.cap3.config.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class Cap3Test {

    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Person person1 = app.getBean(Person.class);
        Person person2 = app.getBean(Person.class);
        System.out.println(person1 == person2);
    }
}
