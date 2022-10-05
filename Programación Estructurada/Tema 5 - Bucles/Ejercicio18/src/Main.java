import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n1 = Integer.parseInt(s.next());

        System.out.println("Introduce otro número: ");
        int n2 = Integer.parseInt(s.next());

        if (n2 == n1) {
            System.out.println("los números NO deben ser iguales");
        }
        else{
            int nMayor = 0;
            
            int nMenor = 0;

            if (n1 > n2) {
                nMenor = n2;
                nMayor = n1;
            }
            else {
                nMenor = n1;
                nMayor = n2;
            }
            int i = 0;
            for (i = 0; nMenor < nMayor ; i++) {
                nMenor+=7;
           }
            System.out.println("El 7 cabe "+(i-1)+" veces entre el primer y segundo número");

        }
    }
}