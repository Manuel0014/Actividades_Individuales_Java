package Clase05_Actividades;//2) Conversor de millas a kilómetros:
//Pídele al usuario que ingrese una distancia en millas.
//Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
//Muestra la distancia en kilómetros al usuario.

import java.util.Scanner;

public class Conversor_de_millas_a_kilometros {
    public static void main(String[] args) {
        Scanner cargarDatos= new Scanner(System.in);

        System.out.println("Ingrese distancia en millas: ");
        Double millas = cargarDatos.nextDouble();

        //convirtiendo las millas a kilometros
        Double kilometros = millas * 1.60934;
        System.out.println("La distancia en kilómetros es: "+kilometros);

    }
}
