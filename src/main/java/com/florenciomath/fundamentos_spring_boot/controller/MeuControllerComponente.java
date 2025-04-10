package com.florenciomath.fundamentos_spring_boot.controller;

import com.florenciomath.fundamentos_spring_boot.ioc_di.MeuComponente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponente {

    @Autowired
    MeuComponente meuComponente;

    @GetMapping("/")
    public String chamandoComponente() {
        var resultado = meuComponente.chamarMeuComponent();
        return resultado;
    }
}
