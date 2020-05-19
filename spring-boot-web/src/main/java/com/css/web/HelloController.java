package com.css.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/**
 * Created by jiming.jing on 2018/8/1.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "Hello World!!!";
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uuid = (UUID) session.getAttribute("uid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uid", uuid);
        return session.getId();
    }
}
