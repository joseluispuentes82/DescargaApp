package descargas;

import java.util.ArrayList;

import java.util.Collection;

public class Pelicula extends Contenido {
	Director director;
	Collection<Actor> actoresPrincipales = new ArrayList<Actor>();
	public Pelicula() {
		super();

	}
	public Pelicula(String id, String titulo) {
		super(id, titulo);

	}

	

}
