package com.skp.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringBootDockerHelloController {

    @GetMapping("/spring-docker")
    public String hellodocker(){
        return "Hello from spring boot deployed on docker";
    }
}
