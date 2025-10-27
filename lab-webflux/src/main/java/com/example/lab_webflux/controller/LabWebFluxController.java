package com.example.lab_webflux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabWebFluxController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/lab-webflux")
  public String labWebFlux() {

    return "lab-webflux";
  }
}
