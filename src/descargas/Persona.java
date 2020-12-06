package descargas;

public abstract class Persona implements Nombrable {

	String nombre;

	public String getNombre() {
		String resultado = nombre;
		if (nombre == null) {
			resultado= "No se dispone del nombre";
		}
		return resultado;

	}

	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

}