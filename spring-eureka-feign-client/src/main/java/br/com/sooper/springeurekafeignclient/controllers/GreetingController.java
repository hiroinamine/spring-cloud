package br.com.sooper.springeurekafeignclient.controllers;

import br.com.sooper.springeurekafeignclient.clients.GreetingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @Autowired
    private GreetingClient client;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/greeting")
    public String greeting() {
        return String.format("Hello from '%s'!", appName);
    }

    @GetMapping("/hi")
    public String hi() {
        String response = client.greeting();
        String msg = String.format("Hi from '%s'!\nReplied '%s'", appName, response);
        log.debug("response: {}", msg);
        return msg;
    }
}
