import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Dame la base del rectangulo: ");
        double b = Double.parseDouble(s.next());

        System.out.printf("Dame la altura del rectangulo: ");
        double h = Double.parseDouble(s.next());

        System.out.println("El área del rectángulo es: " + (b*h));

    }
}