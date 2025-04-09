package com.florenciomath.fundamentos_spring_boot.primeiroProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.florenciomath")
public class FundamentosSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringBootApplication.class, args);
	}

}
