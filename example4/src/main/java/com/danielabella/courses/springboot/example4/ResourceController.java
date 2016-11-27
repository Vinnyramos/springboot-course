package com.danielabella.courses.springboot.example4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping(value="/app/usuario/{nome}", method = RequestMethod.GET)
	public String olaMundoPersonalizado(@PathVariable(value="nome") String nome) {
		return "Nome inserido " + nome;
	}

	@RequestMapping(value="/v2", method = RequestMethod.GET)
	public String olaMundoPersonalizadoV2(
		@RequestParam(value="nome",defaultValue="nome padr�o") String nome, 
		@RequestParam(value="sobrenome",defaultValue="sobrenome padr�o") String sobrenm) {
		
		return "Ol� " + nome + " " + sobrenm;
	}
}
