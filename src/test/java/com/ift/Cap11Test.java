package com.ift;

import com.ift.cap11.config.Cap11MainConfig;
import com.ift.cap11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liufei
 * @since 2019/10/16
 */
public class Cap11Test {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap11MainConfig.class);
        OrderService orderService = app.getBean(OrderService.class);
        orderService.save();
        app.close();
    }
}
