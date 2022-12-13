import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu cadena");
        String cadena = s.nextLine();

        System.out.println("Di el caracter que quieres contar");
        char caracter = s.next().charAt(0);

        System.out.println(vecesCaracter(cadena,caracter));
    }
    public static int vecesCaracter(String cadena, char caracter){
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cont++;
            }
        }
        return cont;
    }
}