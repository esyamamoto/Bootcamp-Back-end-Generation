package org.generation.objetivosDeAprendizagem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosDeAprendizagem")
public class objetivosController {
	
		@GetMapping
		public String objetivos()
		{
			return " . ";
		}
}
