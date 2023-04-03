package com.resWebServices.restWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestApi {
    @GetMapping(path = "/welcome")
    public String display(){
        return "Welcome To SpringBoot";
    }
}
