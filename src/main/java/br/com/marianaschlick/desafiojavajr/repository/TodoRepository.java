package br.com.marianaschlick.desafiojavajr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marianaschlick.desafiojavajr.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
