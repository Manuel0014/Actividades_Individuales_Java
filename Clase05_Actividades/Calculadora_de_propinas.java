package Clase05_Actividades;//4) Calculadora de propinas:
//Pídele al usuario que ingrese el total de la cuenta en un restaurante.
//Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
//Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
import java.util.Scanner;
public class Calculadora_de_propinas {
    public static void main(String[] args) {
        Scanner obtenerDatos = new Scanner(System.in);

        System.out.println("Ingrese el total a pagar: ");
        Float totalPagar = obtenerDatos.nextFloat();

        System.out.println("Igrese el porcentaje de propina");
        Float porcentajePropina = obtenerDatos.nextFloat();

        Float propina = totalPagar * (porcentajePropina/100);
        System.out.println("La propina que le corresponde es: "+propina);
    }
}
