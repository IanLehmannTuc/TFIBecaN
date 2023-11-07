package inicio;

import java.util.ArrayList;
import java.util.List;
import controlador.ApuestaController;
import modelo.Equipo;
import modelo.Partido;
import modelo.Pronostico;
import modelo.Ronda;
import modelo.ResultadoEnum;
import modelo.PrincipalPI;

public class Main {

	public static void main(String[] args) {
		
	    PrincipalPI conector = new PrincipalPI();
	    PrincipalPI conectorr = new PrincipalPI();
	    ApuestaController controlador = new ApuestaController();
	    List<String[]> valores = conector.conectar();
	    List<Partido> listaPartidos = new ArrayList<>();
	    
	    for(String[] line : valores) {
	        Partido partido = new Partido(
	        		new Equipo(line[0]),
	        		new Equipo(line[3]),
	        		Integer.parseInt(line[1]),
	        		Integer.parseInt(line[2])
	        		);
	         listaPartidos.add(partido);
	    }
	    List<String[]> valoresr = conectorr.conectarr();
	    List<Pronostico> listaApuestas = new ArrayList<>();
	    for(String[] line : valoresr) {
	    Pronostico pronostico = new Pronostico(new Equipo (line[2]),ResultadoEnum.valueOf(line[3]));
        listaApuestas.add(pronostico);
	    }
	    
	Ronda ronda = new Ronda("1", listaPartidos);
//		
//		Pronostico pronostico1 = new Pronostico(equipo1, ResultadoEnum.ganador);
//		Pronostico pronostico2 = new Pronostico(equipo1, ResultadoEnum.ganador);
//		Pronostico pronostico3 = new Pronostico(equipo5, ResultadoEnum.ganador);
//		
//		List<Pronostico> listaPronosticos = new ArrayList<>();
//		listaPronosticos.add(pronostico1);
//		listaPronosticos.add(pronostico2);
//		listaPronosticos.add(pronostico3);
		
	System.out.println(controlador.calcularPuntaje(listaApuestas, ronda));
}
}
