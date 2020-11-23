package descargas;

public class Pelicula extends Multimedia {
	Director director;
	Actor[] actoresPrincipales;
	public Pelicula() {
		super();

	}
	public Pelicula(String id, String titulo) {
		super(id, titulo);

	}
	@Override
	public TipoArchivo getTipoArchivo() {

		return null;
	}
	

}
