package com.bahd.controller;

import com.bahd.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model){

        //model methods
        model.addAttribute("name","Bahadir");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        //create some random studentId (0-1000) and show it in your UI
        int studentId =new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(11);

        model.addAttribute("numbers", numbers);

        Student student = new Student(1,"Mike","Truner");
        model.addAttribute("student",student);

        return "student/welcome";
    }
}
