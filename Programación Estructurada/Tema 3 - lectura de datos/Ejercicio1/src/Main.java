import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Introduce un número: ");
        int x = Integer.parseInt((s.nextLine()));

        System.out.print("Introduce otro número: ");
        int y = Integer.parseInt((s.nextLine()));

        System.out.println("La multiplicación de ambos es: " + (x * y));
    }
}