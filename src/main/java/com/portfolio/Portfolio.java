package com.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Portfolio {

    @GetMapping("/")
    public String form() {
        return "/practice";
    }
}
