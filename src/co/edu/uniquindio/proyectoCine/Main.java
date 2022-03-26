package co.edu.uniquindio.proyectoCine;

import co.edu.uniquindio.proyectoCine.cine.Cliente;
import co.edu.uniquindio.proyectoCine.cine.Persona;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Persona persona1 = new Persona("Pepito", "1234", true);

        Cliente cliente1 = new Cliente("Pepito", "1234", true, "5678");

        System.out.println(cliente1.isSexo());
    }
}
