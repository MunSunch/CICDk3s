package com.munsun.cicdk3s;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cdkkdc {
    @GetMapping(value = "/", produces = "text/html")
    public String hello() {
        return "redirect:/index.html";
    }
}

