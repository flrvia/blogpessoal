package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 
	
	//Herdando as funçoes do JPA (Manipula o nosso banco de dados), faz essa comunicação com o banco de dados
	// além de utilizar as funções do JPA, nós criamos também métodos odemos criar os métodos personalizados para interagir com banco tbm
	//tipo o findAllByTitulo
	//Coloca o nome da nossa model e referencia o Id com o long
	
	public Optional<Usuario> findByUsuario(String usuario); 
	/*Find = SELECT
	By = Where
	Usuario = coluna usuário da tabela*/

	/*O Optional busca um especifico ao inves de uma lista que é quando usa o List*/
}
