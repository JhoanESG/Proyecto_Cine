package co.edu.uniquindio.proyectoCine.cine;

public class Empleado extends Persona{
    private String codigoEmpleado;

    public Empleado(String nombre, String cedula, boolean sexo, String codigoEmpleado) {
        super(nombre, cedula, sexo);
        this.codigoEmpleado = codigoEmpleado;
    }

}
