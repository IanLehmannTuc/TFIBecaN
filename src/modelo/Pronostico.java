package modelo;

public class Pronostico {
    private Equipo equipo1;
    private Equipo equipo2;
    private ResultadoEnum pronosticoResultado;

    public Pronostico(Equipo equipo1, Equipo equipo2, ResultadoEnum pronosticoResultado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.pronosticoResultado = pronosticoResultado;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public ResultadoEnum getPronosticoResultado() {
        return pronosticoResultado;
    }
}
