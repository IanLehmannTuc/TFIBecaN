package modelo;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoEnum;

    public Pronostico(Equipo equipo, ResultadoEnum resultadoEnum) {
        this.equipo = equipo;
        this.resultadoEnum = resultadoEnum;
    }

    public Partido getPartido() {
        return partido;
    }
    
    public void setPartido(Partido partido) {
    	this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    
    public ResultadoEnum getResultadoEnum() {
    	return resultadoEnum;
    }
    
    public int puntos(){
    	if(partido.resultado(equipo)==resultadoEnum) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }
}
