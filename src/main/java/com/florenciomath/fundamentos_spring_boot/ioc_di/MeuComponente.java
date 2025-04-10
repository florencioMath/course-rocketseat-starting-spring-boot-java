package com.florenciomath.fundamentos_spring_boot.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponente {

    public String chamarMeuComponent() {
        return "Chamado Meu Componente";
    }

}
