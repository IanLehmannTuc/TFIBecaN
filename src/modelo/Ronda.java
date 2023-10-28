package modelo;

import java.util.List;

public class Ronda {
    private String nro;
    private List<Partido> partidos; // Usamos una lista para almacenar múltiples partidos en una ronda

    public Ronda(String nro, List<Partido> partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }

    public String getNro() {
        return nro;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    // Puedes agregar otros métodos para realizar operaciones relacionadas con la ronda, como calcular puntajes
}