package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

/*
 * REVISAR EL ASIENTO O LOS ASIENTOS DE LA RESERVA
 * La reserva me tiene que especificar en que asiento me voy a sentar
 */



public class Reserva {
	
	private String idReserva;
	private int asientosReservados; // implicitamente esta la cantidad de asientos
	private Double montoTtlCop;
	private Persona empleado; //Una persona esta tomando la forma de un empleado
	private Funcion funcion;  // estaba relacionado con codigo de pelicula, # sala, Zona, # asiento, 
	private Persona cliente; // polimorfismo, instanciar al padre que es persona. 

	
	public Reserva(String idReserva, int asientosReservados, Persona empleado, Funcion funcion, Persona cliente, int cantTiquetes) {
		super();
		this.idReserva = idReserva;
		this.asientosReservados = asientosReservados;
		this.montoTtlCop = calcularMontoCop(cantTiquetes);
		this.empleado = empleado;
		this.funcion = funcion;
		this.cliente = cliente;

	}

	@Override
	public String toString() {
		return "Reserva{" +
				"idReserva='" + idReserva + '\'' +
				", asientosReservados=" + asientosReservados +
				", montoCop=" + montoTtlCop +
				", empleado=" + empleado +
				", funcion=" + funcion +
				", cliente=" + cliente +
				'}';
	}



	public double calcularMontoCop(int cantidadTiquetes) {
		double monto= 0;
		double precioPelicula = funcion.definirPrecioPorEntrada(funcion);
		monto = cantidadTiquetes * precioPelicula;
		return monto;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}


	public int getAsientosReservados() {
		return asientosReservados;
	}


	public void setAsientosReservados(int asientosReservados) {
		this.asientosReservados = asientosReservados;
	}

	public String getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}



	public Double getMontoTtlCop() {
		return montoTtlCop;
	}


	public void setMontoTtlCop(Double montoTtlCop) {
		this.montoTtlCop = montoTtlCop;
	}


	public Persona getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}


	public Funcion getFuncion() {
		return funcion;
	}


	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	
	

	
}

