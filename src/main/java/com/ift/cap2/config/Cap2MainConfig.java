package com.ift.cap2.config;

import com.ift.cap1.Person;
import org.springframework.context.annotation.*;

/**
 * @author liufei
 * @since 2019/10/9
 */
@Configuration
//@ComponentScans(value = {
//        @ComponentScan(value = "com.ift.cap2", useDefaultFilters = false, includeFilters = {
//                @ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomTypeFilter.class})
//        })
//})
@ComponentScan
public class Cap2MainConfig {

    @Bean
    public Person person() {
        return new Person("liufei", 20);
    }
}
