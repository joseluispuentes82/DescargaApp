package descargas;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DescargaApp {

	public static void main(String[] args) {
		Contenido cancion1 = new Musica("1", "tituloA");
		Contenido cancion2 = new Musica("2", "tituloB");
		Contenido pelicula1 = new Pelicula("3", "tituloC");
		Contenido pelicula2 = new Pelicula("4", "tituloD");

		Fichero[] listaDescargas = { new Fichero("id1", null, cancion1, 15.2f),
				new Fichero("id2", null, cancion2, 14.5f), new Fichero("id3", null, pelicula1, 104.5f),
				new Fichero("id4", null, pelicula2, 95.5f)};
		List<Fichero> listaDescargasFicheros = Arrays.asList(listaDescargas);
		listaDescargasFicheros.sort(null);
		System.out.println(listaDescargasFicheros);
		Fichero[] arrayDescargasFicheros = new Fichero[listaDescargasFicheros.size()];
		arrayDescargasFicheros = listaDescargasFicheros.toArray(arrayDescargasFicheros);
		Conexion conexion = new Conexion() {

			@Override
			public float getVelocidadDescarga() {
				return 5f;
			}

		};
		System.out.println("Tiempo estimado: " + Utils.getTiempo(listaDescargas, conexion));

		Identificable[] identificables = { listaDescargas[0], cancion2, pelicula1, pelicula2 };
		for (Identificable identificable : identificables) {
			System.out.println(identificable.getId());
		}
		emitirInforme(arrayDescargasFicheros, conexion);
	}
	public static void emitirInforme(Fichero[] listaDescargas, Conexion conexion) {
		double tamanoTotal = 0;
		for (Fichero fichero : listaDescargas) {
			System.out.println(fichero);
			tamanoTotal += fichero.getTamano();
		}
		System.out.println(String.format("El Tamano total de la descarga es: %s y el tiempo de descarga es %s", tamanoTotal, tamanoTotal/conexion.getVelocidadDescarga()));
	}
}
