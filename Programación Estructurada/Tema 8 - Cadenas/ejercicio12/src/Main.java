import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("dime una cadena");
        String cadena = s.nextLine();

        System.out.println("Dime el caracter que le quieres quitar");
        char caracter = s.next().charAt(0);

        System.out.println(quitaCaracter(cadena, caracter));
    }
    public static String quitaCaracter(String cadena, char caracter){
        String cadena2 = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                cadena2 = cadena.replace(caracter, ' ');

            }
        }
        return cadena2;
    }
}