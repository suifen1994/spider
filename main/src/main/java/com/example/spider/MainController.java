package com.example.spider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping("/index")
    public String index(String name) {
        return "main，hello "+name;
    }
}
