import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int base = 0;
        System.out.println("Dime la base: ");
        base = Integer.parseInt(s.next());



        System.out.println("Dime el exponente: ");
        int exp = Integer.parseInt(s.next());

        int potencia = 1;
        for (int i = 0; i < exp ; i++) {
            potencia*=base;
        }

        System.out.println("El resulltado es: "+potencia);


    }
}