package com.ift.cap3.config;

import com.ift.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author liufei
 * @since 2019/10/9
 */
@Configuration
public class Cap3MainConfig {

    /**
     * Scope:
     * prototype：多实例，IOC容器在启动时不会创建，只有当使用时才会创建
     * singleton：单实例，IOC容器在启动时就会创建并入IOC容器中，默认为单实例
     * request：主要针对Web应用一次请求创建一次
     * session: 同一session创建一个实例
     * Lazy:
     * 主要针对单实例Bean
     * 默认在容器启动时就创建Bean
     * 容器启动时不创建Bean，仅当第一次使用时才会创建
     */
    @Bean
//    @Scope("prototype")
    @Lazy
    public Person person() {
        return new Person("liufei", 20);
    }
}
