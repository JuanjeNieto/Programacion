import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        String cadena = s.nextLine();
        System.out.println("Tiene un total de "+numeroVocales(cadena)+" vocales");

    }
    public static int numeroVocales(String cadena){
        int contador = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||cadena.charAt(i) == 'i' ||cadena.charAt(i) == 'o' ||cadena.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
}