package com.florenciomath.fundamentos_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/pathParams/{id}")
    public String pathParams(@PathVariable String id) {
        return "A Path Variable é: " + id;
    }

}
