import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un número (entero): ");
        int numero = Integer.parseInt(s.next());

        if ((numero%2) == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número no es par");
        }

        if ((numero%5) == 0) {
            System.out.println("Es divisible entre 5");
        }
        else{
            System.out.println("No es divisible entre 5");
        }
    }
}