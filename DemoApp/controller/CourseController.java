package ru.vlsu.kpp.DemoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.vlsu.kpp.DemoApp.AppService;

@Controller
@RequestMapping(path="/course")
public class CourseController {
    @Autowired
    private AppService service;

    @GetMapping("/")
    ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("course/list");
        return mv;
    }

    @GetMapping("/create")
    ModelAndView create(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("course/create");
        return mv;
    }

    @GetMapping("/edit")
    ModelAndView edit(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("course/edit");
        return mv;
    }
}
