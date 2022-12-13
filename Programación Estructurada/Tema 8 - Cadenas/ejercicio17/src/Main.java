import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la cadena que deseas que se convierta en mayuscula");
        String cadena = s.nextLine();

        System.out.println(mayusculasPrimera(cadena));


    }
    public static String mayusculasPrimera(String cadena){

        char[] caracter = cadena.toCharArray();

        for (int i = 0; i < cadena.length() - 2; i++) {
            if (caracter[i] == ' ' || caracter[i] == ',' || caracter[i] == '.') {
                caracter[i+1] = Character.toUpperCase(caracter[i+1]);
            }
        }

        return new String(caracter);
    }
}