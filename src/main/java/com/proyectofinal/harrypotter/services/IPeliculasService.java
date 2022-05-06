package com.proyectofinal.harrypotter.services;

import java.util.List;
import java.util.Optional;

import com.proyectofinal.harrypotter.entities.Pelicula;

public interface IPeliculasService {
	public void addPelicula(Pelicula p);
	public List<Pelicula> findAll();
	public void deletePelicula(int id_to_delete);
	public Optional<Pelicula> findByID(int id);
}
