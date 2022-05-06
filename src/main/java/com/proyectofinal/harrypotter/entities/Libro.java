package com.proyectofinal.harrypotter.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String portada;
	private String autor;
	private String enlace;
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
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public Libro(int id, String titulo, String portada, String autor, String enlace) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.portada = portada;
		this.autor = autor;
		this.enlace = enlace;
	}
	public Libro(String titulo, String portada, String autor, String enlace) {
		super();
		this.titulo = titulo;
		this.portada = portada;
		this.autor = autor;
		this.enlace = enlace;
	}
	public Libro() {
		super();
	}
	
}
