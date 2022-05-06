package com.proyectofinal.harrypotter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectofinal.harrypotter.entities.Pelicula;

public interface IPeliculasRepository extends JpaRepository<Pelicula, Integer>{

}
