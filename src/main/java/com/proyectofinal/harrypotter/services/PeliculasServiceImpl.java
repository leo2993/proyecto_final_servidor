package com.proyectofinal.harrypotter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectofinal.harrypotter.entities.Pelicula;
import com.proyectofinal.harrypotter.repositories.IPeliculasRepository;

@Service
public class PeliculasServiceImpl implements IPeliculasService {
	@Autowired
	IPeliculasRepository repositorio;
	
	@Override
	public void addPelicula(Pelicula p) {
		repositorio.save(p);
		System.out.println("Guardando la pelicula: "+p.getTitulo());
	}

	@Override
	public List<Pelicula> findAll() {
		return repositorio.findAll();
	}


	@Override
	public void deletePelicula(int id_to_delete) {
		repositorio.deleteById(id_to_delete);
	}
	
	@Override
	public Optional<Pelicula> findByID(int id) {
		return repositorio.findById(id);
	}
	
}
