package Clase05_Actividades;//1) Calculadora de edad de perros:
//Pídele al usuario que ingrese la edad de su perro.
//Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
import java.util.Scanner;

public class Calculadora_de_edad_de_perros {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro: ");
        int edadPerro = cargarDatos.nextInt();
        //convirtiendo la edad del perro en el equivalente a humano
        int conversionEdadPerro = edadPerro * 7;

        System.out.println("La edad de tu perro en humano es: "+conversionEdadPerro);
    }
}