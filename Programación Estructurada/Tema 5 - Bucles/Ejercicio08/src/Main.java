import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número del que quieras ver la tabla de mutiplivcar: ");
        int num = Integer.parseInt(s.next());
        if (num <= 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + "x" + i + "=" + num * i);
            }
        }
        else{
            System.out.print("No voy a hacer la tabla de ese número, es muy grande");
        }
    }
}