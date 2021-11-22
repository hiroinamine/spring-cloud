package br.com.sooper.springeurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/greeting")
    public String greeting() {
        return String.format("Hello from '%s'!", appName);
    }
}