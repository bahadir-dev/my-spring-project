package com.bahd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    //Use @ReqestMapping annotation to associate the action with an HTTP request path
    @RequestMapping("/home")
    public String home(){
        return "home.html"; //Return the HTML doc name that contains the details we want the browser display
    }

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }
}
