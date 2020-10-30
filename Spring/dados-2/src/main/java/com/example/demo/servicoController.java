package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ponto no endereço do site
@RequestMapping("/hello")
@RestController
public class servicoController {

	@GetMapping("/get1")
		public String hello1() {
			return "Hey get1! Hello World";
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Hey get2! Hello World";
	}
	 
	@Autowired
	private servicoRepository repository;
	
	@GetMapping ("/servicos")
	public List<servicoModel> pegarTodos() {		
		return repository.findAll();

	}
}
