package com.index.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index/index")
public class IndexController {

    @RequestMapping("/index")
    public String index(String name) {
        return "index，hello "+name;
    }
}
