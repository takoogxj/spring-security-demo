package com.gxj.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,spring security";

    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasAnyRole('admin')")
    public String helloAdmin(){
        return "hello,admin";

    }

    @GetMapping("/helloUser")
    @PreAuthorize("hasAnyRole('admin','normal')")
    public String helloUser(){
        return "hello,user";

    }
}
