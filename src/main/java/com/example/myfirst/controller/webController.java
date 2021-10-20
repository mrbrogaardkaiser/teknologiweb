package com.example.myfirst.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class webController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/courses")
    public String courses(){
        return "courses";
    }

    @GetMapping("/education")
    public String education(){
        return "education";
    }

    @GetMapping("/experience")
    public String experience(){
        return "experience";
    }

    @GetMapping("/interests")
    public String interests(){
        return "interests";
    }

    @GetMapping("/skills")
    public String skills(){
        return "skills";
    }

    @GetMapping("/voluntary")
    public String voluntary(){
        return "voluntary";
    }





}

