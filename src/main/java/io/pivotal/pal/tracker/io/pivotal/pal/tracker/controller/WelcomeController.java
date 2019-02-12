package io.pivotal.pal.tracker.io.pivotal.pal.tracker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by su20043051 on 2/12/2019.
 */

@RestController
public class WelcomeController {
       @Value("${welcome.message}")
        private String message;

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
    /*@GetMapping("/hello")
    public String getPalTracker() {
        return "Hello PalTracker";
    }*/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}