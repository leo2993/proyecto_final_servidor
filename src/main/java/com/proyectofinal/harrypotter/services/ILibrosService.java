package com.proyectofinal.harrypotter.services;

import java.util.List;
import java.util.Optional;

import com.proyectofinal.harrypotter.entities.Libro;

public interface ILibrosService {
	public void addLibro(Libro l);
	public List<Libro> findAll();
	public void deleteLibro(int id_to_delete);
	public Optional<Libro> findByID(int id);
}
