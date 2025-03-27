package com.microservices_with_sb.microservice_with_sb_employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greetHello(){
        return "Hello from Employee service";
    }
}
