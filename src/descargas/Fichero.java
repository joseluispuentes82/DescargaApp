package descargas;

public class Fichero implements Identificable, Comparable<Fichero> {
	private String id;
	private String ruta;
	private Contenido contenido;
	private double tamano; //Tamaño en MB
	
	public double getTamano() {
		return tamano;
	}
	
	public Fichero(String id, String ruta, Contenido musica, float tamano) {
		super();
		this.id = id;
		this.ruta = ruta;
		this.contenido = contenido;
		this.tamano = tamano;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public int compareTo(Fichero otroFichero) {
		return getId().compareTo(otroFichero.getId());
	}

	@Override
	public String toString() {
		return "Fichero [id=" + id + "]";
	}
	
}

