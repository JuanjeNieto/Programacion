import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu cadena");
        String cadena = s.nextLine();

        System.out.println("Di la palabra quieres contar");
        String palabra = s.next();

        System.out.println(vecesCaracter(cadena,palabra));
    }
    public static int vecesCaracter(String cadena, String palabra){
        int cont = 0;


        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i).startsWith(palabra)) {
                cont++;
            }
        }


        return cont;
    }
}