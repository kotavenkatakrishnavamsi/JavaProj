package com.star.agile.assignment.Springboootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloWorldController {

  @RequestMapping("/")
  @ResponseBody
  public String index(){
    return "index";
  }
}