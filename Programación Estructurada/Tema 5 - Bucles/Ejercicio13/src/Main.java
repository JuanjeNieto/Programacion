import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contNegativo = 0;
        int contPositivo = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un número: ");
            num = Integer.parseInt(s.next());

            if (num > 0) {
                contPositivo++;
            }
            else {
                contNegativo++;
            }
        }
        System.out.println("Tienes "+contPositivo+" números positivos");
        System.out.println("Tienes "+contNegativo+" números negativos");
    }

    }
