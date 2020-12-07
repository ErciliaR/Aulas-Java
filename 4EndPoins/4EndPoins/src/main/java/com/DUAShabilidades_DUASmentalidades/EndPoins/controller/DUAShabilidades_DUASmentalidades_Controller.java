package com.DUAShabilidades_DUASmentalidades.EndPoins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DUAShabilidades_DUASmentalidades")
public class DUAShabilidades_DUASmentalidades_Controller {
	
	@GetMapping ("/habilidades")
	public String Question01() {
		return "Quais são as duas habilidades que foram utilizadas aqui?";
	}
	@GetMapping ("/habilidades/resposta")
	public String Anwser01() {
		return "As habilidades mais aplicadas nessa tarefa foram: orientação ao detalhe e gestão do tempo.";
	}
	@GetMapping ("/mentalidades")
	public String Question02() {
		return "Quais são as duas mentalidades que foram utilizadas aqui?";
	}
	@GetMapping ("/mentalidades/resposta")
	public String Anwser02() {
		return "As mentalidades mais aplicadas nessa tarefa foram: mentalidade de crescimento e persistencia.";
	}
	
}
