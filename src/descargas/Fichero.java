package descargas;

public class Fichero implements Identificable {
	private String id;
	private String ruta;
	private Contenido contenido;
	private float tamano; //Tamaño en MB
	
	public float getTamano() {
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
}
