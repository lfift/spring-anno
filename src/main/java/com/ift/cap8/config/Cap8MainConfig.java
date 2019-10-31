package com.ift.cap8.config;

import com.ift.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Configuration
@PropertySource(value = "classpath:bird.properties")
public class Cap8MainConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }
}
