package com.proyectofinal.harrypotter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectofinal.harrypotter.entities.Libro;
import com.proyectofinal.harrypotter.repositories.ILibrosRepository;

@Service
public class LibrosServiceImpl implements ILibrosService {
	@Autowired
	ILibrosRepository repositorio;
	
	@Override
	public void addLibro(Libro l) {
		repositorio.save(l);
	}

	@Override
	public List<Libro> findAll() {
		return repositorio.findAll();
	}


	@Override
	public void deleteLibro(int id_to_delete) {
		repositorio.deleteById(id_to_delete);
	}
	
	@Override
	public Optional<Libro> findByID(int id) {
		return repositorio.findById(id);
	}

	
}
