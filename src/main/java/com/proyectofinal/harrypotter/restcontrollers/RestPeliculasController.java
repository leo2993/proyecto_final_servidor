package com.proyectofinal.harrypotter.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinal.harrypotter.entities.Libro;
import com.proyectofinal.harrypotter.entities.Pelicula;
import com.proyectofinal.harrypotter.services.ILibrosService;
import com.proyectofinal.harrypotter.services.IPeliculasService;

@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
public class RestPeliculasController {
	@Autowired
	IPeliculasService peliculasService;
	
	@Autowired
	ILibrosService librosService;
	
	@GetMapping(path="/peliculas", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Pelicula> getPeliculas(){
		return peliculasService.findAll();
	}
	
	@GetMapping(path="/libros", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Libro> getLibros(){
		return librosService.findAll();
	}
	
	
}
