package com.css.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JIMING on 2018/9/24.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello SpringBoot!";
    }
}
