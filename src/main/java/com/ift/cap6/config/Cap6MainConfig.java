package com.ift.cap6.config;

import com.ift.cap1.Person;
import com.ift.cap6.bean.Cat;
import com.ift.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liufei
 * @since 2019/10/9
 */
@Configuration
@Import({Dog.class, Cat.class, CustomImportSelector.class, CustomImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {

    @Bean
    public Person lison() {
        System.out.println("调用方法创建lison...");
        return new Person("lison", 21);
    }

    @Bean
    public CustomFactoryBean customFactoryBean() {
        return new CustomFactoryBean();
    }
}
