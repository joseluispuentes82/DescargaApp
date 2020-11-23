package descargas;

public abstract class Multimedia extends Contenido {

	public Multimedia() {
		super();
	}

	public Multimedia(String id, String titulo) {
		super(id, titulo);
	}
	public abstract TipoArchivo getTipoArchivo();
	

}