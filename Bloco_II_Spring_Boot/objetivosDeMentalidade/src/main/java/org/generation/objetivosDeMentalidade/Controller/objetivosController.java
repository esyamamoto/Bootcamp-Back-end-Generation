package org.generation.objetivosDeMentalidade.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosDeMentalidade")


public class objetivosController {
	
	
		@GetMapping
		
		public String objetivos()
		{
			return "  -------OBJETIVO DE MENTALIDADE---------\n\n"
					+ "|         MUITA persistência         |\n"
					+ "|        Mentalidade de crescimento  |\n"
					+ "-------------------------------------- ";
		}
}
