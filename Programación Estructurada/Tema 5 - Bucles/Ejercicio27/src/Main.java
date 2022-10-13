import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int num = Integer.parseInt((s.next()));

        int suma = 0;
        for (int i = 1; i <= num ; i++) {
            if (i%3 == 0){
                System.out.print(i+" ");
                suma += i;
            }

        }

        System.out.println("la suma de los multiplos de 3 entre 1 y "+num+" es igual a: "+suma);
    }
}