import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(s.next());

        int fact = 1;

        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.print(fact);
    }
}
