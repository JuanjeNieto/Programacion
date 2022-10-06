import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        int contador = 0;
        int suma = 0;
       do{
            System.out.println("Dame un número: ");
            n = Integer.parseInt((s.next()));

            suma = suma + n;

            contador++;
        }while(suma < 10000);
        System.out.println("Has introducido "+contador+" números y la suma es "+suma);
        System.out.println("La media es: " + (suma/contador));
    }
}