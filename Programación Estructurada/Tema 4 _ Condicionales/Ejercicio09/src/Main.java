import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1, x2;

        System.out.println("Dime el valor de a: ");
        double a = Double.parseDouble(s.next());

        System.out.println("Dime el valor de b: ");
        double b = Double.parseDouble(s.next());

        System.out.println("Dime el valor de c: ");
        double c = Double.parseDouble(s.next());

        // Esto de aqui he tenido que buscarlo, no tengo ni idea de matemáticas

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("0 = 0, por tanto tiene infinitas soluciones");
        }
        if (a == 0 && b == 0 && c != 0) {
                System.out.println("No hay ninguna solución válida");
        }
        if (a != 0 && b != 0 && c == 0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = -b/a");

        }
        if(a != 0 && b != 0 && c != 0){
            double discriminante = b*b - (4*a*c);
            if (discriminante < 0) {
                System.out.println("LA solucion no es real");
            }
            else
            {
                System.out.println("x1 = "+ (-b + Math.sqrt(discriminante)) /(2/a));
                System.out.println("x2 = "+ (-b - Math.sqrt(discriminante)) /(2/a));
            }

        }
    }
}