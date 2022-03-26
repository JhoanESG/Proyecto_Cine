package co.edu.uniquindio.proyectoCine.cine;

public class Cliente extends Persona{

    private String codCliente;

    public Cliente(String nombre, String cedula, boolean sexo, String codCliente) {
        super(nombre, cedula, sexo);
        this.codCliente = codCliente;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }


}
