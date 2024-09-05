package com.sboot.booting.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    
    @RequestMapping("/")
    public String first(){
        return "home";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
