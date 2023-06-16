//Arma un buscador de países con Google Maps.
//Primero, pidele al usuario que ingrese un país (Ej: Colombia).
//Después muestra en consola la concatenación de:
//“https://www.google.com/maps/search/” + pais
//Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
package Clase06_Actividades;
import java.util.Scanner;

public class buscador_de_países_con_Google_Maps {
    public static void main(String[] args) {
        Scanner capturarDatos = new Scanner(System.in);

        System.out.println("Ingrese un país: ");
        String pais = capturarDatos.next();

        System.out.println("https://www.google.com/maps/search/" + pais);

    }
}
