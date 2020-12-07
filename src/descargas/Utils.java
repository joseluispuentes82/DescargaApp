package descargas;

import java.util.List;

public class Utils {

	public static double getTamano(List<Descargable> listaDescargas) {
		double resultado  = 0;
		for (Descargable descargable : listaDescargas) {
			resultado += descargable.getTamano();
		}
		return resultado;
	}

	public static double getTiempo(List<Descargable> listaDescargas, Conexion conexion) {
		return getTamano(listaDescargas)/conexion.getVelocidadDescarga();
	}
	
}
