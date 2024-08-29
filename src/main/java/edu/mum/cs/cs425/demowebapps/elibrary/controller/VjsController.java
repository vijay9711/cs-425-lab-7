package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VjsController {
    @GetMapping({"/register"})
    public String displayRegisterPage() {
        return "register/index";
    }
}
