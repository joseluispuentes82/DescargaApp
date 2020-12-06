package descargas;

import java.util.Comparator;

public interface Descargable extends Comparable<Descargable> {
	double getTamano();
	Contenido getContenido();
	
	Comparator<Descargable>  COMPARADOR = new Comparator<Descargable>() {

		@Override
		public int compare(Descargable d1, Descargable d2) {
			int valorComparacion = d1.getContenido().getId().compareTo(d2.getContenido().getId());
			if(valorComparacion == 0) {
				valorComparacion = -COMPARADOR_POR_TAMANO.compare(d1, d2);
			}
			return valorComparacion;
		}
		
	};
	
	Comparator<Descargable> COMPARADOR_POR_TAMANO = (d1, d2) -> Double.compare(d1.getTamano(), d2.getTamano());

	@Override
	default int compareTo(Descargable descargable) {
		return COMPARADOR.compare(this, descargable);
	}
	
	
	

	
}
