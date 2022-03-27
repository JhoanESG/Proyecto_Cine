package co.edu.uniquindio.proyectoCine.cine;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Funcion {
	
	private Pelicula pelicula;
	private Sala sala;
	private ArrayList<Double> precioFuncion;
	private LocalDateTime horaFuncion;
	
	public Funcion(Pelicula pelicula, Sala sala, LocalDateTime horaFuncion) {
		super();
		this.pelicula = pelicula;
		this.sala = sala;
		this.horaFuncion = horaFuncion;
		precioFuncion = new ArrayList<Double>();
		llenarArrayPrecios();
	}

	private void llenarArrayPrecios(){
		double inicial = 5000;
		for (int i = 0; i < 4; i++) {
			precioFuncion.add(inicial);
			inicial += 800;
		}
	}

	public double definirPrecioPorEntrada(Funcion funcion){
		String idPelicula = funcion.getPelicula().getCodPelicula();
		double precioTiquete = 0;
		for (int i = 0; i < 4 ; i++) {
			if (idPelicula.equals(precioFuncion.indexOf(i))) {
				precioTiquete = precioFuncion.get(i);
				break;
			}
		}
		return precioTiquete;
	}

	public ArrayList<Double> getPrecioFuncion() {
		return precioFuncion;
	}
	public void setPrecioFuncion(ArrayList<Double> precioFuncion) {
		this.precioFuncion = precioFuncion;
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
