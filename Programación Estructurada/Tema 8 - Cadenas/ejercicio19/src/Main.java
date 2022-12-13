import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la cadena que deseas");
        String cadena = s.nextLine();

        System.out.println(inviertePalabras(cadena));


    }
    public static String inviertePalabras(String cadena){

        String[] palabras = cadena.split(" ");

        for(int i = 0; i < palabras.length;i++){

            palabras[i] = invierteCadena(palabras[i]);
        }

        String cadenaInvertida = String.join(" ", palabras);

        return cadenaInvertida;



    }public static String invierteCadena (String cadena){
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i > -1; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }

}