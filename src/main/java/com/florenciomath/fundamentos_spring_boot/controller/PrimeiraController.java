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

    @PostMapping("/bodyParams")
    public String bodyParams(@RequestBody Usuario usuario) {
        return "Os Body Params são: " + "username: " +  usuario.username() + ", age: " + usuario.age();
    }

    record Usuario(String username, Integer age) {}

    @PostMapping("/headerParam")
    public String headerParam(@RequestHeader("name") String name) {
        return "O Header Param é: " + name;
    }

    @PostMapping("/headersParams")
    public String headersParams(@RequestHeader Map<String, String> headers) {
        return "Os Headers Params são: " + headers.entrySet();
    }

}
