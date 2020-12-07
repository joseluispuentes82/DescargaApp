package descargas;

import java.util.*;

public class DescargaApp {

	public static void main(String[] args) {
		Contenido cancion1 = new Musica("1", "tituloA");
		Contenido cancion2 = new Musica("2", "tituloB");
		Contenido pelicula1 = new Pelicula("3", "tituloC");
		Contenido pelicula2 = new Pelicula("4", "tituloD");
		List<Descargable> listaDeDescargas = new ArrayList<Descargable>();
		listaDeDescargas.add(new Fichero("id1", null, "archivo1", cancion1, 15.2));
		listaDeDescargas.add(new Fichero("id2", null, "archivo2", cancion2, 14.5));
		listaDeDescargas.add(new Fichero("id3", null, "archivo3", pelicula1, 104.5));
		listaDeDescargas.add(new Fichero("id4", null, "archivo4", pelicula2, 95.5));
		Descargable fichero5 = new Fichero("id7", "/home/musica/", "archivo7", new Musica("7", "tituloJ"), 23);
		listaDeDescargas.add(fichero5);
		listaDeDescargas.add(new Fichero("id5", "/home/pelis/", "archivo5", new Pelicula("5", "titulo25"), 515));
		listaDeDescargas.sort(null);
//		System.out.println(listaDeDescargas);
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
//		
//		Identificable[] identificables = { descargas[0], cancion2, pelicula1, pelicula2 };
//		for (Identificable identificable : identificables) {
//			System.out.println(identificable.getId());
//		}
		comenzarDescarga(listaDeDescargas, movistar);
	}
	public static void comenzarDescarga(List<Descargable> listaDescarga, Conexion conexion) {
		emitirInforme(listaDescarga, conexion);
	}
	public static void emitirInforme(List<Descargable> listaDescargasFicheros, Conexion conexion) {
		double tamanoTotal = 0;
		for (Descargable fichero : listaDescargasFicheros) {
			System.out.println(fichero);
			tamanoTotal += fichero.getTamano();
		}
		System.out.println(String.format("El Tamano total de la descarga es %s MB,s y el tiempo de descarga es %s",
				tamanoTotal, calcularTiempo((int) (tamanoTotal / conexion.getVelocidadDescarga()))));
	}
	private static String calcularTiempo(int tsegundos)
	{
		int horas = (tsegundos / 3600);
		int minutos = ((tsegundos-horas*3600)/60);
		int segundos = tsegundos-(horas*3600+minutos*60);
	    return String.format("%s horas, %s minutos y %s segundos", horas, minutos, segundos);
	}
}
