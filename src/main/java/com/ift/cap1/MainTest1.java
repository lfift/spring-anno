package com.ift.cap1;

import com.ift.cap1.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class MainTest1 {

    public static void main(String[] args) {
//        XML方式
//        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
//        注解方式
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = app.getBean(Person.class);
        System.out.println(person);
        String[] beanNames = app.getBeanNamesForType(Person.class);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
