import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu cadena");
        String cadena = s.nextLine();

        System.out.println(invierteCadena(cadena));
    }
    public static String invierteCadena (String cadena){
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i > -1; i--) {
           cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}