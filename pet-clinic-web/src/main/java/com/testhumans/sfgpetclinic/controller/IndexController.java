package com.testhumans.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "templates/index.html"})
    public String index() {
        System.out.println("In indexController...");
        return "index";
    }
}
