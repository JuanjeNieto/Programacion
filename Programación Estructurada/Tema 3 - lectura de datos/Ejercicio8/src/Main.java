import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);

        System.out.printf("Indica cuantas horas ha trabajado el empleado: ");
        int horas = Integer.parseInt(s.next());

        System.out.println("El trabajador debe cobrar "+ (horas*12) + " euros.");
    }
}