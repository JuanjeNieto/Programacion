import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;

        System.out.println("Dime el valor de a: ");
        double a = Double.parseDouble(s.next());

        System.out.println("Dime el valor de b: ");
        double b = Double.parseDouble(s.next());

        System.out.println("Dime el valor de c: ");
        double c = Double.parseDouble(s.next());

        // Esto de aqui he tenido que buscarlo, no tengo ni idea de matemáticas

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("0 = 0, por tanto tiene indefinidas soluciones");


        } else {
            if (a == 0 && b == 0) {
                System.out.println("No hay ninguna solución válida");
            }
            else
            {
                if (a == 0) {
                    x = (-c/b);
                    System.out.println("la solución de x es: "+ x);
                } else if ( b != 0 && c != 0) {
                    double d = ((b*b) - (4*a*c));

                    if (d > 0) {
                        System.out.println("Existen dos soluciones diferentes");
                        System.out.println("x1 = " + (-b + Math.sqrt(d)) / (2 * a));
                        System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));

                    } else {
                        System.out.println("Null");
                    }
                }
            }
        }
    }
}