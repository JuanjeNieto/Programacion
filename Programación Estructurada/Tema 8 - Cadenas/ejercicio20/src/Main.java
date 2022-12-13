import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la cadena que deseas");
        String cadena = s.nextLine();


        System.out.println(quitaEspaciosSobrantes(cadena));
    }
    public static String quitaEspaciosSobrantes(String cadena){

        String cadenafinal;

        cadenafinal = cadena.replaceAll(" +", " ").trim();

        return cadenafinal;
    }
}