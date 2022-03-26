package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

public class Zona {
	
	private String idZona;
	//private ArrayList<Asiento> asientos;
	private Asiento matrizAsientos[][] = new Asiento[12][15];

//	public Zona(ArrayList<Asiento> zonas, String idZona) {
//		super();
//		this.asientos = zonas;
//		this.idZona = idZona;
//	}


	public Zona(String idZona) {
		this.idZona = idZona;
	}

	public void llenarMatrizAsientos(){
		String llenar= "";
		for (int i = 0; i < matrizAsientos.length; i++) {
			for (int j = 0; j < matrizAsientos[0].length; j++) {
				llenar = "" + (1+ i) + "  " +(j+1);
				matrizAsientos[i][j].setNumSilla(llenar);
			}

		}
	}

	public String getIdZona() {
		return idZona;
	}

	public void setIdZona(String idZona) {
		this.idZona = idZona;
	}


	

	
}
