package com.proyectofinal.harrypotter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectofinal.harrypotter.entities.Libro;

public interface ILibrosRepository extends JpaRepository<Libro, Integer>{

}
