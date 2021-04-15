package com.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "indexIndexController")
@RequestMapping(value = "/index/index")
public class IndexController {

    @RequestMapping("/index")
    public String index(String name) {
        return "index，hello "+name;
    }
}
