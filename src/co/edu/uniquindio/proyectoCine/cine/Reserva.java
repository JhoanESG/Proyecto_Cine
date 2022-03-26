package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

/*
 * REVISAR EL ASIENTO O LOS ASIENTOS DE LA RESERVA
 * La reserva me tiene que especificar en que asiento me voy a sentar
 */



public class Reserva {
	
	private String idReserva;
	private ArrayList<Asiento> asientosReservados; // implicitamente esta la cantidad de asientos 
	private Double montoCop;
	private String tipoPago;
	private Persona empleado; //Una persona esta tomando la forma de un empleado
	private Funcion funcion;  // estaba relacionado con codigo de pelicula, # sala, Zona, # asiento, 
	private Persona cliente; // polimorfismo, instanciar al padre que es persona. 
	
	
	public Reserva(String idReserva, ArrayList<Asiento> asientosReservados, Double montoCop, String tipoPago,
			Persona empleado, Funcion funcion, Persona cliente) {
		super();
		this.idReserva = idReserva;
		this.asientosReservados = asientosReservados;
		this.montoCop = montoCop;
		this.tipoPago = tipoPago;
		this.empleado = empleado;
		this.funcion = funcion;
		this.cliente = cliente;
	}


	public Persona getCliente() {
		return cliente;
	}


	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Asiento> getAsientosReservados() {
		return asientosReservados;
	}


	public void setAsientosReservados(ArrayList<Asiento> asientosReservados) {
		this.asientosReservados = asientosReservados;
	}



	public String getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}



	public Double getMontoCop() {
		return montoCop;
	}


	public void setMontoCop(Double montoCop) {
		this.montoCop = montoCop;
	}


	public String getTipoPago() {
		return tipoPago;
	}


	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
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

