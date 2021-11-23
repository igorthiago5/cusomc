package com.Igor.CursoMC.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Igor.CursoMC.domain.Categoria;



//controladores rest 

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//A informação será recuperada via get(barra de navegação)
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> Lista() {
		Categoria c1 = new Categoria(1,"Informatica");
		Categoria c2 = new Categoria(2,"Escritótio");
		
		List lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		return lista;
	}

}
