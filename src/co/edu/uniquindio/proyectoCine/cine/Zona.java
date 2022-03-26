package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

public class Zona {
	
	private String idZona;
	private ArrayList<Asiento> asientos;

	public Zona(ArrayList<Asiento> zonas, String idZona) {
		super();
		this.asientos = zonas;
		this.idZona = idZona;
	}

	public String getIdZona() {
		return idZona;
	}

	public void setIdZona(String idZona) {
		this.idZona = idZona;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	

	
}
