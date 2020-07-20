package com.springboot.georlock.controller;


import com.springboot.georlock.svc.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class LoginController {
    @Autowired
    TestService testService;




    @RequestMapping("/")
    public String test() {
        System.out.println("login");
        return "login";
    }

    @RequestMapping("/access")
    public String access() {
        System.out.println("access");
        return "access";
    }

    @RequestMapping("/record")
    public String record() {
        System.out.println("record");
        return "record";
    }


    @RequestMapping("/logout")
    public String logout() {
        System.out.println("logout");
        return "redirect:/";

    }



}