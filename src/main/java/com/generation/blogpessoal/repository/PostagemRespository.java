package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRespository extends JpaRepository<Postagem, Long> {

	
	//IgnoreCase - ignora se é maiscula ou minuscula
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
	
}
