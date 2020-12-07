package descargas;

public class Musica extends Contenido {
	Artista artista;

	public Musica() {
		super();

	}

	public Musica(String id, String titulo) {
		super(id, titulo);

	}

	public Musica(String id, String titulo, Artista artista) {
		super(id, titulo);
		this.artista = artista;

	}

}
