package com.ift.cap7.config;

import com.ift.cap7.bean.Bike;
import com.ift.cap7.bean.Jeep;
import com.ift.cap7.bean.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufei
 * @since 2019/10/14
 */
@Configuration
@ComponentScan(basePackages = "com.ift.cap7")
public class Cap7MainConfig {

//    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bike bike() {
        return new Bike();
    }

//    @Bean
    public Train train() {
        return new Train();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Jeep jeep() {
        return new Jeep();
    }
}
