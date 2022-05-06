package com.proyectofinal.harrypotter.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String sinopsis;
	private String actores;
	private int estreno;
	private int duracion;
	private String portada;
	private String trailer;
	private String enlace;
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getEstreno() {
		return estreno;
	}
	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public Pelicula(int id, String titulo, String sinopsis, String actores, int estreno, int duracion, String portada,
			String trailer) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.actores = actores;
		this.estreno = estreno;
		this.duracion = duracion;
		this.portada = portada;
		this.trailer = trailer;
	}
	public Pelicula(String titulo, String sinopsis, String actores, int estreno, int duracion, String portada,
			String trailer, String enlace) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.actores = actores;
		this.estreno = estreno;
		this.duracion = duracion;
		this.portada = portada;
		this.trailer = trailer;
		this.enlace = enlace;
	}
	public Pelicula() {
		super();
	}
}
