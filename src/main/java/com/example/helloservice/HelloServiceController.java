package com.example.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class HelloServiceController {

    @GetMapping
    String hello() {
        return "<h1>Hey there partner!</h1>";
    }

}
