package com.ift.cap9.config;

import com.ift.cap9.dao.TestDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Configuration
@ComponentScan({"com.ift.cap9"})
public class Cap9MainConfig {

//    @Primary
    @Bean("testDAO")
    public TestDAO testDAO() {
        TestDAO testDAO = new TestDAO();
        testDAO.setFlag("2");
        return testDAO;
    }
}
