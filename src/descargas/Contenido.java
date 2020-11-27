package descargas;

public abstract class Contenido implements Identificable, Nombrable {

	private String id;
	private String titulo;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getTitulo() {
		String resultado = titulo;
		if (titulo == null) {
			resultado= "No se dispone del título";
		}
		return resultado;
	}
	
	public Contenido() {
		super();
	}

	public Contenido(String id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}
	

}