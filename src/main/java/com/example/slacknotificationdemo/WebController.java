package com.example.slacknotificationdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/bad")
    public String brokenEndpoint(){
        throw new RuntimeException("Something bad happended");
    }

}
