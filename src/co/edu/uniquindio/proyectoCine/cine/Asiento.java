package co.edu.uniquindio.proyectoCine.cine;

public class Asiento {
	
	private String codSilla;

	public String getNumSilla() {
		return codSilla;
	}

	public void setNumSilla(String numSilla) {
		this.codSilla = numSilla;
	}

	public Asiento(String numSilla) {
		super();
		this.codSilla = numSilla;
	}
	
}
