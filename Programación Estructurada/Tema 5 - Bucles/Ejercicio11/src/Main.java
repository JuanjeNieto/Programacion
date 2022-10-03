import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = 0;

        int cuadrado = 0;

        int cubo = 0;



        for (int i = 0; i < 5; i++) {
            System.out.print("Dime un número: ");
            num = Integer.parseInt(s.next());

            cuadrado = num * num;
            cubo = num * num * num;

            System.out.println("El numero: "+num+"\tEl cuadrado: "+cuadrado+"\tEl cubo: "+ cubo);
        }


    }
}