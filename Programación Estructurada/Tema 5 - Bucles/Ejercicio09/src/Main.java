import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Dime un número entero: ");
        int num = Integer.parseInt(s.next());

        int i = 0;

        for ( i = 0; num > 0; i++){
            num = num/10;
        }
        System.out.println("El número tiene "+i+" cifras.");
    }
    }
