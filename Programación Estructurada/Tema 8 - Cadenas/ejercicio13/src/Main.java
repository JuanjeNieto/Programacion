import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena = s.nextLine();

        System.out.println(quitaAcentos(cadena));
    }
    public static String quitaAcentos (String cadena){
        String acentos ="ÁÉÍÓÚáéíóú";
        String noacentos ="AEIOUaeiou";
        String resultado = cadena;
        int posicion = -1;

        for (int i = 0; i < resultado.length() ; i++) {

            posicion = acentos.indexOf(resultado.charAt(i));

            if (posicion != -1) {
                resultado = resultado.replace(resultado.charAt(i), noacentos.charAt(posicion));
            }
        }

        return resultado;
    }
}