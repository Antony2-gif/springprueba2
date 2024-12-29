package com.spring.spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {


    @GetMapping("/pruebas")
    public String getMethodName() {
        return "Hola";
    }
    
    
}
