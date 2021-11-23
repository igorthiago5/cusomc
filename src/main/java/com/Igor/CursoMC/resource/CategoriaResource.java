package com.Igor.CursoMC.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



//controladores rest 

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//A informação será recuperada via get(barra de navegação)
	@RequestMapping(method=RequestMethod.GET)
	public String retornar() {
		return "retorno ok";
	}

}
