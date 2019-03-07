package com.testeapigoodreads.testeapigoodreads.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.testeapigoodreads.testeapigoodreads.models.Livros;

@Repository
public interface LivrosRepository extends CrudRepository<Livros, String> {

	//Iterable<Livros> findByIdLivro(long IdLivro);
	
	@Query("SELECT a FROM Livros a WHERE a.IdLivro = :IdLivro")
	Iterable<Livros> findByIdLivro(@Param("IdLivro") long IdLivro);
}
