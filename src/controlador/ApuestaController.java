package controlador;

import modelo.Pronostico;
import modelo.Ronda;

import java.util.List;

public class ApuestaController {

	public int calcularPuntaje(List<Pronostico> listaPronosticos, Ronda ronda) {
		int puntajeTotal = 0;
		for(int i = 0; ronda.getPartidos().size()>=i; i++) {
				if(ronda.getPartidos().get(i).getEquipo1().getNombre() == listaPronosticos.get(i).getEquipo().getNombre()) {
					listaPronosticos.get(i).setPartido(ronda.getPartidos().get(i));
					puntajeTotal += listaPronosticos.get(i).puntos();
				}
				else if(ronda.getPartidos().get(i).getEquipo2().getNombre() == listaPronosticos.get(i).getEquipo().getNombre()) {
					listaPronosticos.get(i).setPartido(ronda.getPartidos().get(i));
					puntajeTotal += listaPronosticos.get(i).puntos();
					
				}
				i++;
		}
		return puntajeTotal;
	}
	
}
