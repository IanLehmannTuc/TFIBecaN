package controlador;

import modelo.Partido;

public class PartidoController {
    private Partido[] partidos;

    public PartidoController(Partido[] partidos) {
        this.partidos = partidos;
    }

    public void procesarResultados() {
        // Implementa aquí la lógica para procesar los resultados de los partidos
        // Puedes calcular puntajes, verificar pronósticos, etc.
    }
}
