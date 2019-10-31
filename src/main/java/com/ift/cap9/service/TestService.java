package com.ift.cap9.service;

import com.ift.cap9.dao.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Service
public class TestService {

//    @Qualifier
    @Autowired
//    @Resource(name = "testDAO3")
//    @Qualifier("testDAO2")
//    @Inject
    private TestDAO testDAO3;

    public void print() {
        System.out.println(testDAO3);
    }
}
