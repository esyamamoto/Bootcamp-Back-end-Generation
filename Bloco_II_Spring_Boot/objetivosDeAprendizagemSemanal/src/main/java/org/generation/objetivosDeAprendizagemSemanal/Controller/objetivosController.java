package org.generation.objetivosDeAprendizagemSemanal.Controller;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/objetivosDeAprendizagem")
	public class objetivosController {
		
			@GetMapping
			public String objetivos()
			{
				return "    -------OBJETIVO DE APRENDIZAGEM---------\n\n"
						+ "|        Entender melhor o Spring         |\n"
						+ "|        Revisar materiais passados       |\n"
						+ "|       Contribuir com o grupo do PI      |\n"
						+ "|         NÃO SURTAR , tá tudo bem        |\n"
						+ "--------------------------------------------";
			}
	}