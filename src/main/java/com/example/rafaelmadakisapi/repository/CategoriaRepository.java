package com.example.rafaelmadakisapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rafaelmadakisapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
