import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("dame un numero: ");
        int num1 = Integer.parseInt(s.next());

        System.out.println("dame otro numero: ");
        int num2 = Integer.parseInt(s.next());

        for (int i = 0; i < num1; i++) {
            if ((i%num2) != 0){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}