package com.homelabs.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/eita", method = RequestMethod.GET)
    public String eita() {
        return "eita nois";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");

        String str = "Hello World!";
        mav.addObject("message", str);

        return mav;
    }

}
