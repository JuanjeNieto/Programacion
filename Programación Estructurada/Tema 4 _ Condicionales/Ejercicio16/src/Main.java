import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0;
        int respuesta;
        System.out.println("Tu pareja se asea con más frecuencia?\n1. Sí\n2. No");
        respuesta = Integer.parseInt(s.next());
        if (respuesta == 1) {
            contador+=3;
        }
        System.out.println("Tu pareja llega mas tarde del trabajo?\n1. Sí\n2. No");
        respuesta = Integer.parseInt(s.next());
        if (respuesta == 1) {
            contador+=3;
        }
        System.out.println("Tu pareja no confía en el mundial de España?\n1. Sí\n2. No");
        respuesta = Integer.parseInt(s.next());
        if (respuesta == 1) {
            contador+=3;
        }
        System.out.println("Tu pareja no es fan de Fernando Alonso?\n1. Sí\n2. No");
        respuesta = Integer.parseInt(s.next());
        if (respuesta == 1) {
            contador+=3;
        }
        System.out.println("Tu pareja ha ido a La isla de las Tentaciones?\n1. Sí\n2. No");
        respuesta = Integer.parseInt(s.next());
        if (respuesta == 1) {
            contador+=3;
        }

        System.out.println("Tu pareja tiene una probabilidad de serte infiel del "+contador+"/15");
    }
}