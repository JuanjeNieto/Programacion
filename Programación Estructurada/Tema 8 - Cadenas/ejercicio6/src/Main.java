import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un cadena ");
        String cadena = s.nextLine();

        System.out.println("Dime la longitud de la cadena: ");
        int longitud = s.nextInt();

        System.out.println(padLeft(cadena, longitud));
        System.out.println(padRight(cadena, longitud));

    }
    public static String padLeft (String cadena, int longitud){
        String espacios = "";

        int nespacios = longitud - cadena.length();

        for (int i = 0; i < nespacios; i++) {
            espacios = espacios + '-';
        }
        cadena = espacios + cadena;
        return cadena;
    }
    public static String padRight (String cadena, int longitud){
        String espacios = "";

        int nespacios = longitud - cadena.length();

        for (int i = 0; i < nespacios; i++) {
            espacios = espacios + '-';
        }
        cadena = cadena + espacios;
        return cadena;
    }
}