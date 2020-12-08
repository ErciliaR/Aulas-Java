package com.DUAShabilidades_DUASmentalidades.EndPoins.controller;

import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DUAShabilidades_DUASmentalidades")
public class DUAShabilidades_DUASmentalidades_Controller {
	
	/*@GetMapping ("/habilidades")
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
	}*/
	
	// controller
	@ResponseBody @RequestMapping("/description")
	public Description getDescription(@RequestBody UserStats stats){
	    return new Description(stats.getFirstName() + " " + stats.getLastName() + " hates wacky wabbits");
	}

	// domain / value objects
	public class UserStats{
	    private String firstName;
	    private String lastName;
	    // + getters, setters
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
	public class Description{
	    private String description;
	    // + getters, setters, constructor
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Description(String description) {
			super();
			this.description = description;
		}
		
	}
	
	
}
