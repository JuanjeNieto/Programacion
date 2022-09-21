import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Dame la altura del cono: ");
        double h = Double.parseDouble(s.next());

        System.out.printf("Dame el radio del cono: ");
        double r = Double.parseDouble(s.next());

        System.out.println("El volumen del cono es "+((3.14/3)*(r*r)*h));
    }
}