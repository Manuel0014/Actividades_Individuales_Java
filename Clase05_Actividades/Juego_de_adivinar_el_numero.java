package Clase05_Actividades;//5) Juego de adivinar el número:
//Genera un número aleatorio entre 1 y 10. Pídele al usuario que adivine el número.

import java.util.Scanner;

public class Juego_de_adivinar_el_numero {
    public static void main(String[] args) {
        Scanner obtenerDatos = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 10);
        //System.out.println(numeroAleatorio); para ver el numero aleatorio

        System.out.println("Ingrese un numero del 1 al 10: ");
        Integer numeroIngresado = obtenerDatos.nextInt();

        if (numeroIngresado==numeroAleatorio){
            System.out.println("Felicidades, has adivinado el numero.");
        }else {
            System.out.println("No has adivinado el numero.");
        }

    }
}
