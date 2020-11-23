package descargas;

public class Musica extends Multimedia {
	Artista artista;

	public Musica() {
		super();
		 
	}

	public Musica(String id, String titulo) {
		super(id, titulo);
		
	}

	@Override
	public TipoArchivo getTipoArchivo() {

		return null;
	}
	

	
}

