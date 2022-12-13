import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una cadena: ");
        String cadena = s.nextLine();

        System.out.print("Dime un caracter ");
        char caracter = s.nextLine().charAt(0);
        System.out.println();
        System.out.print("Dime un otro caracter ");
        char caracter2 = s.nextLine().charAt(0);
        System.out.println();
        System.out.println(sustituyeCaracter(cadena, caracter, caracter2));
    }

    public static String sustituyeCaracter(String cadena, char caracter, char caracter2){
            String cadena2;
            cadena2 = cadena.replace(caracter, caracter2);
            return cadena2;
    }
}