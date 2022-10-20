
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        System.out.println("Relacion Ejercicio 06 - Bucles");
        do {
            System.out.println("Dime un ejercicio (0 para salir): ");
            Scanner s = new Scanner(System.in);
            opcion = s.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                default:
                    System.out.println("Ejercicio inexistente!");
                    break;
            }
        } while (opcion != 0);
    }

    public static void ejercicio1() {
        int count = 0;

        for (int i = 1; i <= 3; i++) {
            double r = (Math.random() * 6 + 1);

            System.out.print((int) r + " ");
            count += r;

        }
        System.out.println();
        System.out.println(count);
        System.out.println();
    }

    public static void ejercicio2() {
        System.out.println("Muestra una carta al azar:");
        int carta = (int) (Math.random() * 13) + 1; // genera un número aleatorio

        switch (carta) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
                break;

        }
        int palo = (int) (Math.random() * 4) + 1;

        switch (palo) {
            case 1:
                System.out.print(" de Pica");
                break;
            case 2:
                System.out.print(" de Trébol");
                break;
            case 3:
                System.out.print(" de Corazones");
                break;
            case 4:
                System.out.print(" de Diamantes");
                break;
        }
        System.out.println();


    }

    public static void ejercicio3() {
        System.out.println("Muestra una carta española al azar:");
        int carta = (int) (Math.random() * 10) + 1; // genera un número aleatorio

        switch (carta) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("Sota");
                break;
            case 9:
                System.out.print("Caballo");
                break;
            case 10:
                System.out.print("Rey");
                break;

            default:
                break;

        }
        int palo = (int) (Math.random() * 4) + 1;

        switch (palo) {
            case 1:
                System.out.print(" de Basto");
                break;
            case 2:
                System.out.print(" de Oro");
                break;
            case 3:
                System.out.print(" de Copa");
                break;
            case 4:
                System.out.print(" de Espada");
                break;
        }
        System.out.println();
    }

    public static void ejercicio4() {
        for (int i = 1; i <= 20; i++) {
            System.out.print((int) (Math.random() * 10 + 1) + " ");
        }
    }

    public static void ejercicio5() {

        int suma = 0;
        int max = 0;
        int min = 199;

        for (int i = 1; i <= 50; i++) {
            double r = (Math.random() * 100) + 100;

            System.out.print((int) r + " ");

            if (r > max) {
                max = (int) r;
            } else if (r < min) {
                min = (int) r;
            }
            suma += r;

        }
        System.out.println();
        System.out.println("El minimo es = " + min);
        System.out.println("El maximo es = " + max);
        System.out.println("La media es " + (suma / 50));
        System.out.println();
    }

    public static void ejercicio6() {
        Scanner s = new Scanner(System.in);

        double r = ((int) (Math.random() * 101));
        int cont = 4;
        int numerointroducido = 0;
        int i = 0;

        while (i <= cont && numerointroducido != r) {
            System.out.println("Dime un número");
            numerointroducido = Integer.parseInt(s.next());

            if (numerointroducido == r) {
                System.out.println("ENHORABUENAAA");
            } else {
                if (numerointroducido < r) {
                    System.out.println("Intenta con uno más grande");
                }
                if (numerointroducido > r) {
                    System.out.println("Intenta uno más pequeño");
                }
                System.out.println("Te quedan " + cont + " intentos");

                cont--;
            }
        }
    }

    public static void ejercicio7() {
        Scanner s = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("QUINIELA JORNADA 09 LA LIGA SANTANDER");
        String valorApuesta = "";


        for (int i = 1; i <= 14; i++) {
        }
    }
}
