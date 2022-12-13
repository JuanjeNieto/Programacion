import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe una cadena");
        String cadena = s.nextLine();
        System.out.println(cadena);
        System.out.println("Tiene un total de "+ numeroEspacios(cadena)+" espacios.");
    }
    public static int numeroEspacios(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}