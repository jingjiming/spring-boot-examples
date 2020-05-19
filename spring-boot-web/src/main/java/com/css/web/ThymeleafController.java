package com.css.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jiming.jing on 2018/8/1.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/hi")
    public String hello(Locale locale, Model model) {
        model.addAttribute("greeting", "Hello");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formatedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formatedDate);

        return "hello";
    }
}
