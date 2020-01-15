package com.bean.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name",required = false, defaultValue = "hello")
                                    String name, Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "greeting";
    }

}
