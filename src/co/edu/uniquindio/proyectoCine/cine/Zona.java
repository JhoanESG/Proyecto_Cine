package co.edu.uniquindio.proyectoCine.cine;

import java.util.ArrayList;

public class Zona {
	
	private String idZona;
	//private ArrayList<Asiento> asientos;
	private Asiento matrizAsientos[][];

	public Zona(String idZona, int filas, int columnas) {
		matrizAsientos = new Asiento[filas][columnas];
		this.idZona = idZona;
		llenarMatrizAsientos();
	}


	private void llenarMatrizAsientos(){

		for (int i = 0; i < matrizAsientos.length; i++) {
			int fila = matrizAsientos[0].length;
			for (int j = 0; j < matrizAsientos[0].length; j++) {
				matrizAsientos[i][j] = new Asiento( (char)('A'+i), fila, false);
				fila --;
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
