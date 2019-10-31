package com.ift.cap9.controller;

import com.ift.cap9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;
}
