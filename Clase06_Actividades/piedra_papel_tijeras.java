//Escribe un programa que permita al usuario jugar el juego clásico
// de "piedra, papel, tijeras" contra la computadora. El programa debe solicitar
// al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar una elección aleatoria
// para la computadora. Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.
package Clase06_Actividades;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijeras {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            // Mostrar las opciones y solicitar la elección del jugador
            System.out.println("Elige: 0 - Piedra, 1 - Papel, 2 - Tijeras, 3 - Salir");
            int jugador = scanner.nextInt();

            if (jugador == 3) {
                System.out.println("Juego terminado.");
                break;
            }

            if (jugador < 0 || jugador > 2) {
                System.out.println("Opción inválida. Por favor, elige nuevamente.");
                continue;
            }

            // Generar la elección aleatoria de la computadora
            int computadora = random.nextInt(3);

            System.out.println("Jugador: " + opciones[jugador]);
            System.out.println("Computadora: " + opciones[computadora]);

            // Determinar el ganador
            if (jugador == computadora) {
                System.out.println("Empate!");
            } else if ((jugador == 0 && computadora == 2) || (jugador == 1 && computadora == 0)
                    || (jugador == 2 && computadora == 1)) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            System.out.println();
        }

        scanner.close();
    }
}
