package co.edu.uniquindio.proyectoCine.cine;

import java.time.LocalDateTime;

public class Funcion {
	
	private Pelicula pelicula;
	private Sala sala;
	private LocalDateTime horaFuncion;
	
	public Funcion(Pelicula pelicula, Sala sala, LocalDateTime horaFuncion) {
		super();
		this.pelicula = pelicula;
		this.sala = sala;
		this.horaFuncion = horaFuncion;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public LocalDateTime getHoraFuncion() {
		return horaFuncion;
	}
	public void setHoraFuncion(LocalDateTime horaFuncion) {
		this.horaFuncion = horaFuncion;
	}
	
	
}
