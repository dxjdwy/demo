package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
    @RequestMapping("/contact")
    public String contact(Model model){
        return "contact";
    }
    @RequestMapping("/about")
    public String about(Model model){
        return "about";
    }
//    @RequestMapping("/1")
//    public String one(Model model){
//        return "1";
//    }
}
