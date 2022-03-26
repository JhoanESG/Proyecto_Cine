package co.edu.uniquindio.proyectoCine.cine;

public class Empleado extends Persona{
	
	private String tipoEmpleado;
	private String codigoEmpleado;

	public Empleado(String nombre, String cedula, boolean sexo, String tipoEmpleado, String codigoEmpleado) {
		super(nombre, cedula, sexo);
		this.tipoEmpleado = tipoEmpleado;
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}
