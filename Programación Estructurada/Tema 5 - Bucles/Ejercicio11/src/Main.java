import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cuadrado = 0;

        int cubo = 0;

            System.out.print("Dime un número: ");
            int num = Integer.parseInt(s.next());

        for (int i = num; i <= 5; i++) {
            

            cuadrado = num * num;
            cubo = num * num * num;

            System.out.println("El numero: "+num+"\tEl cuadrado: "+cuadrado+"\tEl cubo: "+ cubo);
        }


    }
}
