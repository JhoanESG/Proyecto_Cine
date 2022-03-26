package co.edu.uniquindio.proyectoCine.cine;

public class Sala {
	
	private Zona zonaGeneral;
	private Zona zonaPreferencial;
	private String idSala;
	
	public Sala(Zona zonaGeneral, Zona zonaPreferencial, String idSala) {
		super();
		this.zonaGeneral = zonaGeneral;
		this.zonaPreferencial = zonaPreferencial;
		this.idSala = idSala;
	}
	
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
