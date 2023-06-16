package Clase06_Actividades;

import java.util.Scanner;

public class cargar_3_números_y_mostrar_cual_es_el_número_promedio {
    public static void main(String[] args) {
        Scanner capturarDatos = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = capturarDatos.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = capturarDatos.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numero3 = capturarDatos.nextInt();

        float promedio = (float)(numero1+numero2+numero3)/3;
        System.out.println("El promedio de los tres numeros es: "+promedio);
    }
}
