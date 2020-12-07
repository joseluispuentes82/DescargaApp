package descargas;

import java.util.ArrayList;

import java.util.Collection;

public class Pelicula extends Contenido {
	Director director;
	Collection<Actor> actoresPrincipales = new ArrayList<>();
	public Pelicula() {
		super();

	}
	public Pelicula(String id, String titulo) {
		super(id, titulo);

	}
	public Pelicula(String id, String titulo, Director director, Collection<Actor> actores) {
		super(id, titulo);
		this.director = director;
		actoresPrincipales = actores;

	}
	

}
