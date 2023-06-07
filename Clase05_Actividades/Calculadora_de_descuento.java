package Clase05_Actividades;//3) Calculadora de descuento:
//Pídele al usuario que ingrese el precio original de un producto.
//Pídele al usuario que ingrese el porcentaje de descuento.
//Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
//Muestra el precio final al usuario.

import java.util.Scanner;

public class Calculadora_de_descuento {
    public static void main(String[] args) {
        Scanner obtenerDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto: ");
        Double precioOriginal = obtenerDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        Double porcentajeDescuento = obtenerDatos.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento/100);

        System.out.println("El precio final del producto es: "+precioFinal);
    }
}
