import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Introduce la cadena");
        String cadena = s.nextLine();

        System.out.println("introduce la palabra que quieres quitar");
        String palabra1 = s.next();

        System.out.println("introduce la palabra que quieres añadir");
        String palabra2 = s.next();

        System.out.println(sustituyePalabra(cadena, palabra1, palabra2));
    }
    public static String sustituyePalabra(String cadena, String palabra1, String palabra2)
    {
        String cadena2 = "";

        cadena2 = cadena.replaceAll(palabra1, palabra2);

        return cadena2;
    }
}