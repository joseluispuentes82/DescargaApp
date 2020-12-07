package descargas;

import java.util.Comparator;

public class Fichero implements Identificable, Descargable, ConRuta {
	private String id;
	private String ruta;
	private String nombreArchivo;
	private Contenido contenido;
	private double tamano; //Tamaño en MB
	
	public double getTamano() {
		return tamano;
	}
	
	public Fichero(String id, String ruta, String nombre, Contenido contenido, double tamano) {
		super();
		this.id = id;
		this.ruta = ruta;
		this.contenido = contenido;
		this.tamano = tamano;
		nombreArchivo = nombre;
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
		return String.format("Fichero %s    %s   Ruta: %s", getId(),getNombreArchivo(), getRuta());
	}

	@Override
	public Contenido getContenido() {
		return contenido;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}


}

