import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        String cadena = s.nextLine();
        System.out.println(esPalindromo(cadena));
    }

    public static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        boolean palindromo = false;
        String invertida = new StringBuilder(cadena).reverse().toString();

        if (cadena.equals(invertida)){
            palindromo = true;
        }
        return palindromo;
    }
}