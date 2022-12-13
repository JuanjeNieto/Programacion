import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = s.nextLine();

        System.out.println(esNumero(cadena));

    }
    public static boolean esNumero (String cadena){

        // se usa la expresion regular y el .matches()
        // que indica si el string coincide con la expresion dada

        boolean numero = (cadena.matches("[0-9]+"));

        return numero;
    }
}