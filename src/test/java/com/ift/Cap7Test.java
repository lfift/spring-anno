package com.ift;

import com.ift.cap7.bean.Plain;
import com.ift.cap7.config.Cap7MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/14
 */
public class Cap7Test {


    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfig.class);
//        app.getBean("bike");
//        app.getBean("train");
//        app.getBean("jeep");
        Plain plain = app.getBean(Plain.class);
        System.out.println(plain.getEnvironment());
        app.close();
    }
}
