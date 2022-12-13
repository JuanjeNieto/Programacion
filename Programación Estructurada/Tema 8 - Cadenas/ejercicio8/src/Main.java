import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dame una cadena: ");
        String cadena = s.nextLine();

        System.out.println(quitaEspaciosTrim(cadena));
    }
    public static String quitaEspaciosTrim(String cadena){
       String cadenaTrim;
       String cadenaTrim2;
       cadenaTrim = cadena.replaceAll(" +", " ");
       cadenaTrim2 = cadenaTrim.substring(1, cadenaTrim.length()-1);
       return cadenaTrim2;
    }
}