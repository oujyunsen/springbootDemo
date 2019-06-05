package com.sample.springboot.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01Controller {

  @RequestMapping(name="/version", method=RequestMethod.GET)
  public String getVersion() {
    return "v01";

  }

}
