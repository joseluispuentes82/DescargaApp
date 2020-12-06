package descargas;

import java.util.*;

public class DescargaApp {

	public static void main(String[] args) {
		Contenido cancion1 = new Musica("1", "tituloA");
		Contenido cancion2 = new Musica("2", "tituloB");
		Contenido pelicula1 = new Pelicula("3", "tituloC");
		Contenido pelicula2 = new Pelicula("4", "tituloD");

		Fichero[] descargas = { new Fichero("id1", null, cancion1, 15.2), new Fichero("id2", null, cancion2, 14.5),
				new Fichero("id3", null, pelicula1, 104.5), new Fichero("id4", null, pelicula2, 95.5) };
		List<Descargable> listaDescargasFicheros = Arrays.asList(descargas);
		Descargable fichero5 = new Fichero("id7", "/home/musica/", new Musica("7", "tituloJ"), 23);
		System.out.println(fichero5);
		listaDescargasFicheros.add(fichero5);
		listaDescargasFicheros.add(new Fichero("id7", "/home/musica/", new Musica("7", "tituloJ"), 23));
		listaDescargasFicheros.add(new Fichero("id5", "/home/pelis/", new Pelicula("5", "titulo25"), 515));
		listaDescargasFicheros.sort(null);
		System.out.println(listaDescargasFicheros);
		Conexion movistar = new Conexion() {

			@Override
			public double getVelocidadDescarga() {
				return 5;
			}

			@Override
			public String getNombre() {
				return "movistar";
			}

		};
		Conexion vodafone = new Conexion() {

			@Override
			public double getVelocidadDescarga() {
				return 10;
			}

			@Override
			public String getNombre() {
				return "vodafone";
			}

		};
		System.out.println("Tiempo estimado: " + Utils.getTiempo(descargas, movistar));
		
//		
//		Identificable[] identificables = { descargas[0], cancion2, pelicula1, pelicula2 };
//		for (Identificable identificable : identificables) {
//			System.out.println(identificable.getId());
//		}
		emitirInforme(listaDescargasFicheros, movistar);
	}

	public static void emitirInforme(List<Descargable> listaDescargasFicheros, Conexion conexion) {
		double tamanoTotal = 0;
		for (Descargable fichero : listaDescargasFicheros) {
			System.out.println(fichero);
			tamanoTotal += fichero.getTamano();
		}
		System.out.println(String.format("El Tamano total de la descarga es: %s y el tiempo de descarga es %s",
				tamanoTotal, tamanoTotal / conexion.getVelocidadDescarga()));
	}
}
