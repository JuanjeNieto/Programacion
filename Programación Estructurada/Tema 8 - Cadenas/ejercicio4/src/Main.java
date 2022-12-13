import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena = s.nextLine();
        System.out.println("Dime un caracter");
        char caracter = s.next().charAt(0);
        System.out.println(contiene(cadena, caracter));
    }
    public static boolean contiene(String cadena, char caracter){
        boolean contain = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                contain = true;
            }
        }
        return contain;
    }
}