package com.Igor.CursoMC;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Igor.CursoMC.domain.Categoria;
import com.Igor.CursoMC.domain.Produto;
import com.Igor.CursoMC.repositories.CategroiaRepository;
import com.Igor.CursoMC.repositories.ProdutoRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	
	@Autowired
	private CategroiaRepository repo;
	
	@Autowired
	private ProdutoRepository repo1;
	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
		
		
		
	}
	//permite cria elemntos para inserir elemntos no BD
	public void run(String...  args)throws Exception{
		Categoria c1  = new Categoria(null,"Escritorio");
		Categoria c2  = new Categoria(null,"Informátia");
		
		Produto p1 = new Produto(null,"computador",2000.00);
		Produto p2 = new Produto(null,"cadeira",300.00);
		Produto p3 = new Produto(null,"mouse",20.00);
		
		c1.getProduto().addAll(Arrays.asList(p2));
		c2.getProduto().addAll(Arrays.asList(p1,p3));
		
		p1.getCategoria().addAll(Arrays.asList(c2));
		p2.getCategoria().addAll(Arrays.asList(c1));
		p3.getCategoria().addAll(Arrays.asList(c2));
		
		repo.saveAll(Arrays.asList(c1, c2)); 
		repo1.saveAll(Arrays.asList(p1,p2,p3));
	}

}
