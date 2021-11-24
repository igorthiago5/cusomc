package com.Igor.CursoMC.repositories;
/*Será responsável por acesar a dados para criar,deletar e etc
 * devido a mapeação de dados feio pela JPA*/ 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Igor.CursoMC.domain.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto,Integer> {

}
