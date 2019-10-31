package com.ift;

import com.ift.cap9.config.Cap9MainConfig;
import com.ift.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/16
 */
public class Cap9Test {

    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
        TestService testService = app.getBean(TestService.class);
        testService.print();
//        TestDAO testDAO = app.getBean(TestDAO.class);
//        System.out.println(testDAO);
    }
}
