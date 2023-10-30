package modelo;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public ResultadoEnum resultado(Equipo equipo) {
        // Implementa la lógica para determinar el resultado (ganador, perdedor, empate)
        // Puedes utilizar las puntuaciones de goles para calcularlo
//        if (golesEquipo1 > golesEquipo2) {
//            return ResultadoEnum.ganador;
//        } else if (golesEquipo2 > golesEquipo1) {
//            return ResultadoEnum.perdedor;
//        } else {
//            return ResultadoEnum.empate;
//        }
    	
    	if(this.equipo1.getNombre() == equipo.getNombre()) {
    		if(golesEquipo1 > golesEquipo2) {
    			return ResultadoEnum.ganador;
    		}
    		else if(golesEquipo2 > golesEquipo1) {
    			return ResultadoEnum.perdedor;
    		}
    		else {
    			return ResultadoEnum.empate;
    		}
    	}
    	else {
    		if(golesEquipo2 > golesEquipo1) {
    			return ResultadoEnum.ganador;
    		}
    		else if(golesEquipo1 > golesEquipo2) {
    			return ResultadoEnum.perdedor;
    		}
    		else {
    			return ResultadoEnum.empate;
    		}
    	}
    	
    }
}