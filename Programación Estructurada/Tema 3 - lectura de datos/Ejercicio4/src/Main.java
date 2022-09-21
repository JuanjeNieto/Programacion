import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Dame un numero ");
        double x = Double.parseDouble(s.next());

        System.out.printf("Dame otro numero ");
        double y = Double.parseDouble(s.next());


        System.out.println("La suma de ambos es " + (x+y));
        System.out.println("La resta de ambos es " + (x-y));
        System.out.println("La multiplicación de ambos es " + (x*y));
        System.out.println("La división de ambos es " + (x / y));
    }
}