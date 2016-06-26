package com.homelabs.controller;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {

  @RequestMapping("/")
  String home() {
      return "inicial";
  }

  @RequestMapping("/ola")
  public ModelAndView ola(){
    System.out.println("Executando a lógica com Spring MVC");
    ModelAndView model = new ModelAndView();
    model.setViewName("ok");
    return model;
  }

  @RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
}
