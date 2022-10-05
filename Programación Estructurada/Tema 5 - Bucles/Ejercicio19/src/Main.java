import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        System.out.println("introduce un caracter: ");
        String caracter = s.next();

        System.out.println("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(s.next());

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}