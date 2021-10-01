package com.faycel.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf !");
        // return to template/demo.html page.
        return"demo";
    }
}
