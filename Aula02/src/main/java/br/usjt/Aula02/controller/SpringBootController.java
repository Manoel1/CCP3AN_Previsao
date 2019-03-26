package br.usjt.Aula02.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

	@GetMapping ("/hello")
	public String hello() {
	return "hello_spring_boot";
	}
	
}
