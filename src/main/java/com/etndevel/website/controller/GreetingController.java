package com.etndevel.website.controller;

import com.etndevel.website.dao.GreetingRepo;
import com.etndevel.website.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingRepo greetingRepo;

    @GetMapping("/greetings")
    Iterable<Greeting> greetings() {
        return greetingRepo.findAll();
    }

    GreetingController(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }
}
