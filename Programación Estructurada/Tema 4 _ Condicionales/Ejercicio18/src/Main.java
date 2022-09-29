
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        System.out.println("Dime un número entero de máximo 5 cifras");
        int num = Integer.parseInt(s.next());

        if (num < 10) {
            System.out.println("la primera cifra es: "+num);
        }
       else if (num > 10 && num < 100) {
            System.out.println("la primera cifra es: "+num/10);
        }
        else if (num > 100 && num < 1000) {
            System.out.println("la primera cifra es: "+num/100);
        }
        else if (num > 1000 && num < 10000) {
            System.out.println("la primera cifra es: "+num/1000);
        }
        else if (num > 10000 && num < 100000) {
            System.out.println("la primera cifra es: "+num/10000);
        }
        else {
            System.out.println("Este número no me sirve, mete otro");
        }
    }
}