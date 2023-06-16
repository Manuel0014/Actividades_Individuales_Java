//Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
//Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
//Después muestra en consola la concatenación de:
//“https://api.whatsapp.com/send?phone=” + telefono
package Clase06_Actividades;

import java.util.Scanner;

public class llamar_a_una_persona_por_Whatsapp {
    public static void main(String[] args) {
        Scanner capturarDatos = new Scanner(System.in);

        System.out.println("Ingrese un número de telefono (sin espacios): ");
        int telefono = capturarDatos.nextInt();

        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }
}
