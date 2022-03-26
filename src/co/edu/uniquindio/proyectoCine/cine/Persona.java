package co.edu.uniquindio.proyectoCine.cine;

public class Persona {

    private String nombre;
    private String cedula;
    private boolean sexo;

    public Persona(String nombre, String cedula, boolean sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
