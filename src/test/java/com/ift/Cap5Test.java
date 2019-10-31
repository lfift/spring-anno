package com.ift;

import com.ift.cap5.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/9
 */
public class Cap5Test {

    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
        System.out.println("IOC容器创建完成。。。。。");
    }
}
