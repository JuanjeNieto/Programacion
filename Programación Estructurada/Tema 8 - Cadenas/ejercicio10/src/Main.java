import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una cadena ");
        String cadena = s.nextLine();

        System.out.println("tiene un total de "+cuentaPalabras(cadena)+" palabras");
    }
    public static int cuentaPalabras(String cadena){
        int contPalabras = 1;
        String cadenaAux;
        cadenaAux = cadena.replaceAll(" +", " ").trim();
        for (int i = 0; i < cadenaAux.length(); i++) {
            if (cadenaAux.charAt(i) == ' '){
                contPalabras++;
            }
        }
        return contPalabras;
    }
}