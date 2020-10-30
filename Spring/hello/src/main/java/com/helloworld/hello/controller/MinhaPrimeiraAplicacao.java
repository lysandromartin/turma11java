package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class MinhaPrimeiraAplicacao {
	
	@GetMapping
	
	public String hello() {
		return "Orientação ao futuro\r\n"
				+ "Responsabilidade pessoal\r\n"
				+ "Mentalidade de crescimento\r\n"
				+ "Persistência\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+ "Atenção aos detalhes";
	}
}
