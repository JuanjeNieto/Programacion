import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("introduce un número: ");
        int altura = Integer.parseInt(s.next());

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int j = 0; j < (altura/2)+1; j++) {
            System.out.print("* ");
        }
    }
}