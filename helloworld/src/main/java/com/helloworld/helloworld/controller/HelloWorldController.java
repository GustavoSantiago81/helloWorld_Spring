package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	// Subrota
	@GetMapping("/bsm")
	public String bsm() {
		return "Atenção aos Detalhes"
				+ "<br/> Persistência" 
				+ "<br/> VIA"
				+ "<br/> Proatividade"
				+ "<br/> Comunicação";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Estudar todo o CookBook"
				+ "<br> Estudar todo o BackEnd da Grade Curricular";
	}
}
