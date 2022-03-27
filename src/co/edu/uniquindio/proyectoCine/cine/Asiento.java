package co.edu.uniquindio.proyectoCine.cine;

public class Asiento {

	private char letra;
	private int columna;
	private boolean ocupado;


	public Asiento(char letra, int columna, boolean ocupado) {
		this.letra = letra;
		this.columna = columna;
		this.ocupado = ocupado;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra
	) {
		this.letra = letra;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
