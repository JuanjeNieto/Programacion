import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int cifras;

        do {
            System.out.print("Introduce un número ");
            cifras = Integer.parseInt(s.next());
        } while (cifras <= 2);

        int num1 = 0;

        int num2 = 1;

        int fib = 0;

        System.out.print("Las primeras "+cifras+" de la serie de Fibonacci son: "+ num1+" "+num2+ " ");
        for (int i = 0; i < (cifras-2); i++){
            fib = num1 + num2;
            System.out.print(" "+ fib +" ");
            num1 = num2;
            num2 = fib;
        }
    }
}
