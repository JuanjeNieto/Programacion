
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la altura (1-9): ");
        int altura = Integer.parseInt(s.next());

        for (int i = 0; i <= altura; i++) {
            // Columna para los espacios de la pirame
            for (int j = 0; j <= altura-i-1; j++) {
                System.out.print(" ");
            }
            int n = i-1;
            for (int col = 1; col < 2*i; ++col) {
                if (col <= i){
                    System.out.print(col);
                }
                if (col > i){
                    System.out.print(n);
                    n--;
                }
            }
            System.out.println();
        }
    }
}

