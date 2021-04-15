package com.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/index")
public class IndexController {

    @RequestMapping("/index")
    public String index(String name) {
        return "admin，hello "+name;
    }
}
