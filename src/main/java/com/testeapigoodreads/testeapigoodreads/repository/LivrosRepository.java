package com.testeapigoodreads.testeapigoodreads.repository;

import org.springframework.data.repository.CrudRepository;
import com.testeapigoodreads.testeapigoodreads.models.Livros;

public interface LivrosRepository extends CrudRepository<Livros, String> {

}
