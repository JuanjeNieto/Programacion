import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce un caracter: ");
        char caracter = s.next().charAt(0);

        System.out.println("Introduce un numero: ");
        int num = s.nextInt();

        System.out.println(repiteCaracter(caracter, num));
    }
    public static String repiteCaracter(char caracter, int num){
        String cadena = "";
        for (int i = 0; i < num; i++) {
            cadena = cadena + caracter;
        }
        return cadena;
    }
}