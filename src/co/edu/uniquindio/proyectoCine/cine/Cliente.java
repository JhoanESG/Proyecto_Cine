package co.edu.uniquindio.proyectoCine.cine;

public class Cliente extends Persona{
<<<<<<< HEAD
	//private String codCliente no es necesario
	// No hat nada especifico POR AHORA que lo diferencia o algo especifico, REVISAR MAS ADELANTE


	
	
=======

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


>>>>>>> 5e704ed8d3446512a425de0cb6e65309a08364cd
}
