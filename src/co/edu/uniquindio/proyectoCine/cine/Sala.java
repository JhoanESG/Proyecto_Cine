package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

public class Sala {
	
	private Zona zonaGeneral;
	private Zona zonaPreferencial;
	private String idSala;
	
	public Sala(String idSala) {
		super();
		this.zonaGeneral = zonaGeneral;
		this.zonaPreferencial = zonaPreferencial;
		this.idSala = idSala;
		crearZonas();
	}

	public void crearZonas(){
		zonaGeneral = new Zona("01",12, 15);
		zonaPreferencial = new Zona("02", 12, 15);
	}

//	public void reservarAsiento(int cantidad, ArrayList<String> sillas){
//
//		char letras[] = new char[sillas.size()];
//		int numeros[] = new int[sillas.size()];
//		String concatenado = "";
//		for (int i = 0; i < sillas.size(); i++) {
//			concatenado= sillas.get(i);
//
//			for (int j = 0; j < sillas.size(); j++) {
//
//			}
//
//		}
//	}

	public Zona getZonaGeneral() {
		return zonaGeneral;
	}
	public void setZonaGeneral(Zona zonaGeneral) {
		this.zonaGeneral = zonaGeneral;
	}
	public Zona getZonaPreferencial() {
		return zonaPreferencial;
	}
	public void setZonaPreferencial(Zona zonaPreferencial) {
		this.zonaPreferencial = zonaPreferencial;
	}
	public String getIdSala() {
		return idSala;
	}
	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}
	

	
	
}
