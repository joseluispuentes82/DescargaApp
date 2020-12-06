package descargas;

public class Utils {

	public static double getTamano(Fichero[] listaDescargas) {
		float resultado  = 0;
		for (int i = 0; i < listaDescargas.length; i++) {
			resultado += listaDescargas[i].getTamano();
		}
		return resultado;
	}

	public static double getTiempo(Fichero[] listaDescargas, Conexion conexion) {
		return getTamano(listaDescargas)/conexion.getVelocidadDescarga();
	}
	
}
