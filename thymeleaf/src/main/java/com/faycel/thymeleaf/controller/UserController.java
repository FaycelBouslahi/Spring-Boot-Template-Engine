package com.faycel.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf !");
        // First variable with Thymeleaf
        double grade = 18;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));
        // return to template/demo.html page.
        return"demo";
    }

    private String convertGPA(double grade) {
        if (grade >= 19) {
            return  "A";
        } else if (grade < 19 && grade >= 15 ) {
            return  "B";
        } else if (grade < 15 && grade >= 10 ) {
            return  "C";
        } else if (grade < 10 && grade >= 3 ) {
            return  "D";
        } else {
            return ("We Will Fix This Together !");
        }



    }
}
