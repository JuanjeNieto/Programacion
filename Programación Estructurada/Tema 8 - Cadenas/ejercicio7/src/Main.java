import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = s.nextLine();

        System.out.println(quitaEspacios(cadena));
    }
    public static String quitaEspacios (String cadena){
        String cadenaSin;
         cadenaSin = cadena.replace(" ", "");
        return cadenaSin;
    }
}