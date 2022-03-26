package co.edu.uniquindio.proyectoCine.cine;

public class Empleado extends Persona{
<<<<<<< HEAD
	
	private String tipoEmpleado;
	private String codigoEmpleado;

	public Empleado(String codigoEmpleado, String tipoEmpleado) {
		super();
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
	
=======
    private String codigoEmpleado;

    public Empleado(String nombre, String cedula, boolean sexo, String codigoEmpleado) {
        super(nombre, cedula, sexo);
        this.codigoEmpleado = codigoEmpleado;
    }
>>>>>>> 5e704ed8d3446512a425de0cb6e65309a08364cd

}
