package com.antonio.expenseledger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "Hello";
    }

    @GetMapping("/greeting")
    public String greeting(){
        String name = "Antonio";

        return "Hello " + name + "!";
    }

}
