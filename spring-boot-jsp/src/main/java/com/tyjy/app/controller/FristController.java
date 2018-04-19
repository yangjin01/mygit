package com.tyjy.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class FristController {
	@RequestMapping("/first")
	public String first(Model model) {
        model.addAttribute("message", "Hello World!");
        return "first/index";
    }
	@RequestMapping("/hello")
	public String Hello() {
		return  "hello world";
	}
}
