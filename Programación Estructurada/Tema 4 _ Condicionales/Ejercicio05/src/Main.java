import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Indica el valor de a: ");
        double a = Double.parseDouble(s.next());

        System.out.printf("Indica el valor de b: ");
        double b = Double.parseDouble(s.next());

        if (a == 0){
            System.out.println("La ecuación no puede tener solución.");
        }else {
            System.out.println("El valor de x = " + (-b/a));
        }
    }
}