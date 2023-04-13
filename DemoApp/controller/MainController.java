package ru.vlsu.kpp.DemoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.vlsu.kpp.DemoApp.AppService;

@Controller
public class MainController {
    @Autowired
    private AppService service;

    @GetMapping("/")
    ModelAndView frontPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
