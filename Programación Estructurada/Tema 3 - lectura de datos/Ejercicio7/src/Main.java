import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Dame la base imponible del precio");
        double base = Double.parseDouble(s.next());

        System.out.println("El precio TOTAL es: " + base*1.21);
    }
}