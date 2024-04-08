package com.itcast.test_01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping()
    public String hello(){
        System.out.println("hello~~~WY222");
        return "WY222";
    }
}
