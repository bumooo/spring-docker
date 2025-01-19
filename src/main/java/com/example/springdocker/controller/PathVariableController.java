package com.example.springdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/{path}")
    public String mainView(@PathVariable("path") String path) {
        if ("안녕".equals(path)) {
            return "안녕!!";
        }
        return path;
    }
}
