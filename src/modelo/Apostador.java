package modelo;

import java.util.List;

public class Apostador {

	private String nombre;
	private String apellido;
	private List<Pronostico> pronostico;
	
	public Apostador(String nombre, String apellido, List<Pronostico> pronostico){
		this.nombre = nombre;
		this.apellido = apellido;
		this.pronostico = pronostico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public List<Pronostico> getPronostico(){
		return this.pronostico;
	}
	
}
