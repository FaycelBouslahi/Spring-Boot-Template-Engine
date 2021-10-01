package com.faycel.freemaker.controller;

import com.faycel.freemaker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ali", 16.5));
        list.add(new Student(2, "Mohamed", 17.5));
        list.add(new Student(3, "Adam", 20));
        model.addAttribute("list", list);
        return "list";
    }
}
