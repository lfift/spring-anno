package com.ift.cap1.config;

import com.ift.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufei
 * @since 2019/10/9
 */
@Configuration
public class MainConfig {

    @Bean(value = "person1")
    public Person person() {
        return new Person("张三", 123);
    }
}
