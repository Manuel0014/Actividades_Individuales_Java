package Clase06_Actividades;

import java.util.Scanner;

public class cargar_3_números_y_mostrar_cual_es_el_mayor_y_cual_es_el_menor {
    public static void main(String[] args) {
        Scanner capturarDatos = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = capturarDatos.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = capturarDatos.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numero3 = capturarDatos.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es: "+numero1);
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es: "+numero2);
        }else{
            System.out.println("El numero mayor es: "+numero3);
        }
        //Hallando numero menor
        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("El numero menor es: "+numero1);
        }else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("El numero menor es: "+numero2);
        }else{
            System.out.println("El numero menor es: "+numero3);
        }
    }
}
