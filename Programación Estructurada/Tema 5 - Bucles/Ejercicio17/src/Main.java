import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = Integer.parseInt(s.next());




        if (n > 0) {
            int suma = 0;
            for (int i = n; i < (n+100); i++) {
                suma += i;
            }
            System.out.println("la suma es: "+suma);
        } else {
            System.out.println("Introduceme un número positivo colega.");

        }
    }
}