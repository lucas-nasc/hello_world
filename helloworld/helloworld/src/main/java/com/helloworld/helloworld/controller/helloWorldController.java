package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-World")
public class helloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("bsm")
	public String lista() {
		return"""
				BSM’s da Generation Brasil
				
				Mentalidade de crescimento
				responsabilidade
				orentação ao futuro
				orientação aos detalhes
				proatividade
				trabalho em equipe
				""" ;
	}
	@GetMapping("objetivo")
	public String aprendizagem(){
		return """
				Lista de objetivos 
				
				Realizar o projeto do blog pessoal
				terminar exercicios
				ler os cookbook 
				assistir os videos
				""";
	}
	
}
