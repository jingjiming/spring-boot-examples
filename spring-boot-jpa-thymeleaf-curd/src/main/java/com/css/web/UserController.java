package com.css.web;

import com.css.entity.User;
import com.css.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/9.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users = userService.getUserList();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "user/add";
    }

    @RequestMapping("add")
    public String add(User user) {
        userService.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, String id) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.edit(user);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(String id) {
        userService.delete(id);
        return "redirect:/list";
    }
}
