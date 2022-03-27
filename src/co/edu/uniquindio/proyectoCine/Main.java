package co.edu.uniquindio.proyectoCine;

import co.edu.uniquindio.proyectoCine.cine.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

		Pelicula peli2054 = new Pelicula("0", 90,"Malos", GeneroPelicula.FICCION);
		Pelicula peli2055 = new Pelicula("1", 120,"Red", GeneroPelicula.FICCION);
		Pelicula peli2056 = new Pelicula("2", 180,"End Game", GeneroPelicula.ACCION);
		Pelicula peli2057 = new Pelicula("3", 145,"Animales Fantasticos", GeneroPelicula.FANTASIA);
		Pelicula peli2058 = new Pelicula("4", 100,"Los Tipos Malos", GeneroPelicula.FICCION);

		Zona zona1 = new Zona("011", 3,3);

        Cliente cliente1 = new Cliente("Pepito", "1234", true, "5678");

        System.out.println(cliente1.isSexo());
    }
}
