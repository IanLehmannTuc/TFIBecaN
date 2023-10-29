package controlador;

import modelo.Ronda;

public class RondaController {
    private Ronda[] rondas;

    public RondaController(Ronda[] rondas) {
        this.rondas = rondas;
    }

    public void calcularPuntajesAcumulativos() {
        // Implementa aquí la lógica para calcular puntajes acumulativos de las rondas
    }

    public Ronda obtenerRondaPorNumero(String numero) {
        // Implementa aquí la lógica para obtener una ronda por su número
        // Puedes iterar a través del array de rondas y buscar la que coincida con el número
        return null; // Reemplaza esto con la lógica real
    }
}
