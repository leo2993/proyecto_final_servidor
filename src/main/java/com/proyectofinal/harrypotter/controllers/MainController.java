package com.proyectofinal.harrypotter.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.proyectofinal.harrypotter.entities.Pelicula;
import com.proyectofinal.harrypotter.entities.Libro;
import com.proyectofinal.harrypotter.services.IPeliculasService;
import com.proyectofinal.harrypotter.services.ILibrosService;

@Controller
public class MainController {
	@Autowired
	private IPeliculasService peliculasService;
	
	@Autowired
	private ILibrosService librosService;
	
	@RequestMapping(value = "/")
	public ModelAndView verIndice(
			) {
		//List<Pelicula> peliculas = peliculasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		//mav.addObject("peliculas",peliculas);
		return mav;
	}
	
	@RequestMapping(value = "/administrar_peliculas")
	public ModelAndView crearNuevaPelicula(
			@RequestParam(required=false) String titulo,
			@RequestParam(required=false) String sinopsis,
			@RequestParam(required=false) String actores,
			@RequestParam(required=false) Integer estreno,
			@RequestParam(required=false) Integer duracion,
			@RequestParam(required=false) String portada,
			@RequestParam(required=false) String trailer,
			@RequestParam(required=false) String enlace,
			@RequestParam(required=false) Integer id_to_delete
			) {
		List<Pelicula> peliculas = peliculasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrar_peliculas");
		mav.addObject("peliculas",peliculas);
		if (titulo!=null &&
			sinopsis!=null &&
			actores!=null &&
			estreno!=null &&
			duracion!=null &&
			portada!=null &&
			trailer!=null &&
			enlace!=null)
		{
			Pelicula p = new Pelicula(titulo,
					sinopsis,
					actores,
					estreno,
					duracion,
					portada,
					trailer,
					enlace);
			peliculasService.addPelicula(p);
			System.out.println("(Controller) Guardando la pelicula: "+p.getTitulo());
			return new ModelAndView("redirect:/administrar_peliculas");
		}  else if (id_to_delete!=null) {
			peliculasService.deletePelicula(id_to_delete);
			return new ModelAndView("redirect:/administrar_peliculas");
		} else {
			return mav;
		}
	}
	
	
	
	@RequestMapping(value = "/administrar_libros")
	public ModelAndView crearNuevaPelicula(
			@RequestParam(required=false) String titulo,
			@RequestParam(required=false) String portada,
			@RequestParam(required=false) String autor,
			@RequestParam(required=false) String enlace,
			@RequestParam(required=false) Integer id_to_delete
			) {
		List<Libro> libros = librosService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrar_libros");
		mav.addObject("libros",libros);
		if (titulo!=null &&
			portada!=null &&
			autor!=null &&
			enlace!=null)
		{
			Libro l = new Libro(titulo,
					portada,
					autor,
					enlace);
			librosService.addLibro(l);
			return new ModelAndView("redirect:/administrar_libros");
		}  else if (id_to_delete!=null) {
			librosService.deleteLibro(id_to_delete);
			return new ModelAndView("redirect:/administrar_libros");
		} else {
			return mav;
		}
	}
}
