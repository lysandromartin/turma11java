package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class MinhaSegundaAplicacao {
	
	@GetMapping
	public String hello2() {
		return "Persistência (Foco no aprendizado e conhecimento)"
				+ ""
				+ "Podcast ‘Autoconhecimento’ - Spotify\r\n" + 
				"(Focar as habilidades mentais para atingir os objetivos)\r\n" + 
				"\r\n" + 
				"Plataformas de aprendizado (Alura, Cursera, Data Science Academy)\r\n" + 
				"(Focar nas habilidades técnicas (Java, Phyton e outros)  para o aprendizado constante)\r\n" + 
				"\r\n" + 
				" Perfis relacionados a alguns assuntos de interesse para se manter atualizado\r\n" + 
				"Meigarom - Instagram";

		
		
	}

}
