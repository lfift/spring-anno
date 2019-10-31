package com.ift;

import com.ift.cap10.bean.Calculator;
import com.ift.cap10.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/16
 */
public class Cap10Test {

    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
        Calculator calculator = app.getBean(Calculator.class);
        int result = calculator.div(4, 2);
        System.out.println(result);
    }
}
