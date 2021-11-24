package com.Igor.CursoMC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Igor.CursoMC.domain.Categoria;
import com.Igor.CursoMC.repositories.CategroiaRepository;
//clase de servicos para recuperar dados
@Service
public class CategoriaService {
	@Autowired
	private CategroiaRepository  repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		//opreação capaz de buscar no banco de dados pelo id
	}
	
	 
}
