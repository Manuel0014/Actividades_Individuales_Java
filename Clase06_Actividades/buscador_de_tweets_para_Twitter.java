//Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
//Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
//Después muestra en consola la concatenación de:
//“https://twitter.com/search?q=” + palabra
package Clase06_Actividades;
import java.util.Scanner;
public class buscador_de_tweets_para_Twitter {
    public static void main(String[] args) {
        Scanner capturarDatos = new Scanner(System.in);

        System.out.println("Ingrese el nombre de una celebridad. (una palabra): ");
        String palabra = capturarDatos.next();

        System.out.println("https://twitter.com/search?q=" + palabra);
    }
}
