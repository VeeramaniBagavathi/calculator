package com.veera.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc/")
public class CalculatorRestController {

    @GetMapping
    public String testMessage() {
        return "veera success..!!!";
    }
}