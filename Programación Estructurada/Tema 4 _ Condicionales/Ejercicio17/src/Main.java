import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        System.out.println("Dime un número que sea entero");
        int num = Integer.parseInt(s.next());

        int cifra = num%10;

        System.out.println("la ultima cifra es: "+cifra);
    }
}