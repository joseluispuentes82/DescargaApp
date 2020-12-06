package descargas;

import java.util.Comparator;

public class Fichero implements Identificable, Descargable, ConRuta {
	private String id;
	private String ruta;
	private Contenido contenido;
	private double tamano; //Tamaño en MB
	
	public double getTamano() {
		return tamano;
	}
	
	public Fichero(String id, String ruta, Contenido contenido, double tamano) {
		super();
		this.id = id;
		this.ruta = ruta;
		this.contenido = contenido;
		this.tamano = tamano;
	}

	@Override
	public String getRuta() {
		return ruta;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Fichero %s    Ruta: %s", getId(),getRuta());
	}


	@Override
	public Contenido getContenido() {
		return contenido;
	}


}

