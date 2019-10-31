package com.ift.cap5.config;

import com.ift.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufei
 * @since 2019/10/9
 */
@Configuration
public class Cap5MainConfig {


    @Bean
    @Conditional(WinCondition.class)
    public Person person() {
        System.out.println("调用方法创建person...");
        return new Person("liufei", 20);
    }

    @Bean
    public Person lison() {
        System.out.println("调用方法创建lison...");
        return new Person("lison", 21);
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public Person james() {
        System.out.println("调用方法创建james...");
        return new Person("james", 22);
    }
}
