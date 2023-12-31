package com.bahd.controller;

import com.bahd.enums.Gender;
import com.bahd.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/mentors")
    public String mentorPage(Model model){
        Mentor mentor1 = new Mentor("Mike","Smith",45, Gender.MALE);
        Mentor mentor2 =  new Mentor("Tom","Hanks",65,Gender.MALE);
        Mentor mentor3 = new Mentor("Ammy","Bryan",25,Gender.FEMALE);

        model.addAttribute("mentor1",mentor1);
        model.addAttribute("mentor2",mentor2);
        model.addAttribute("mentor3",mentor3);



        return "mentor/mentor";
    }
}
