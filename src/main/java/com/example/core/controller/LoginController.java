package com.example.core.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public ModelAndView logUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        logger.trace("Login Controller Logs");
        return modelAndView;
    }
}
