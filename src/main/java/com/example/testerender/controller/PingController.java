package com.example.testerender.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("ping")
public class PingController {

    @Value("${variavel}")
    private String valor;

    @GetMapping
    public String pong() {
        System.out.println("Chegou!");
        return Instant.now().toString() + "___PONG____ >>> " + valor;
    }
}
