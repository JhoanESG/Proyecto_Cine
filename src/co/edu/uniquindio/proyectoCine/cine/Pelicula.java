package co.edu.uniquindio.proyectoCine.cine;

public class Pelicula {
	private String codPelicula;
	private int duracionMin;
	private String nombrePelicula;
	private GeneroPelicula  genero;
	
	public Pelicula(String codPelicula, int duracionMin, String nombrePelicula, GeneroPelicula genero) {
		super();
		this.codPelicula = codPelicula;
		this.duracionMin = duracionMin;
		this.nombrePelicula = nombrePelicula;
		this.genero= genero;
	}

	public GeneroPelicula getGenero() {
		return genero;
	}

	public void setGenero(GeneroPelicula genero) {
		this.genero = genero;
	}

	public String getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(String codPelicula) {
		this.codPelicula = codPelicula;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	
	
	
	
}
