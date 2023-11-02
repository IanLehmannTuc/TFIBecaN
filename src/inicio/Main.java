package inicio;

import java.util.ArrayList;
import java.util.List;

import controlador.ApuestaController;
import modelo.Equipo;
import modelo.Partido;
import modelo.Pronostico;
import modelo.Ronda;
import modelo.ResultadoEnum;

public class Main {

	public static void main(String[] args) {
		
		ApuestaController controlador = new ApuestaController();
		Equipo equipo1 = new Equipo("Boca", "Equipo Argentino");
		Equipo equipo2 = new Equipo("River", "Equipo Argentino");
		Equipo equipo3 = new Equipo("Barcelona", "Equipo Español");
		Equipo equipo4 = new Equipo("Real Madrid", "Equipo Español");
		Equipo equipo5 = new Equipo("Racing", "Equipo Argentino");
		Equipo equipo6 = new Equipo("Independiente", "Equipo Argnentino");
		
		Partido partido1 = new Partido(equipo1, equipo2, 2, 1);
		Partido partido2 = new Partido(equipo3, equipo4, 0, 0);
		Partido partido3 = new Partido(equipo5, equipo6, 1, 0);
		
		List<Partido> listaPartidos = new ArrayList<>();
		listaPartidos.add(partido1);
		listaPartidos.add(partido2);
		listaPartidos.add(partido3);
		
		Ronda ronda = new Ronda("1", listaPartidos);
		
		Pronostico pronostico1 = new Pronostico(equipo1, ResultadoEnum.ganador);
		Pronostico pronostico2 = new Pronostico(equipo1, ResultadoEnum.ganador);
		Pronostico pronostico3 = new Pronostico(equipo5, ResultadoEnum.ganador);
		
		List<Pronostico> listaPronosticos = new ArrayList<>();
		listaPronosticos.add(pronostico1);
		listaPronosticos.add(pronostico2);
		listaPronosticos.add(pronostico3);
		
		System.out.println(controlador.calcularPuntaje(listaPronosticos, ronda));
	}

}