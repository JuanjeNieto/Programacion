import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dime la altura a la que estás: ");
        double h = Double.parseDouble(s.next());

        if (h != 0) {
            double t = Math.sqrt((2*h)/9.81);
            System.out.println("El tiempo que tardaría en caer es: "+ t);
        }
        else {
            System.out.println("No tiene solucion valida");
        }

    }
}