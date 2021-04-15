package com.admin.controller;

import com.admin.result.Result;
import com.admin.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/query")
    public Result index() {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(projectService.query());
        return result;
    }
    @RequestMapping("/add")
    public String add(String name) {
        return "admin，hello "+name;
    }
    @RequestMapping("/update")
    public String update(String name) {
        return "admin，hello "+name;
    }
    @RequestMapping("/del")
    public String del(String name) {
        return "admin，hello "+name;
    }
}
