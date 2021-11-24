package com.Igor.CursoMC;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Igor.CursoMC.domain.Categoria;
import com.Igor.CursoMC.repositories.CategroiaRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	
	@Autowired
	private CategroiaRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
		
		
		
	}
	//permite cria elemntos para inserir elemntos no BD
	public void run(String...  args)throws Exception{
		Categoria c1  = new Categoria(null,"Escritorio");
		Categoria c2  = new Categoria(null,"Informátia");
		
		repo.saveAll(Arrays.asList(c1, c2)); 
	}

}
