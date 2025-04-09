package com.florenciomath.fundamentos_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/pathParams/{id}")
    public String pathParams(@PathVariable String id) {
        return "A Path Variable é: " + id;
    }

    @GetMapping("/queryParam")
    public String queryParam(@RequestParam String id) {
        return "A Query Param é: " + id;
    }

    @GetMapping("/queryParams")
    public String queryParams(@RequestParam Map<String, String> allParams) {
        return "As Query Params são: " + allParams;
    }

}
