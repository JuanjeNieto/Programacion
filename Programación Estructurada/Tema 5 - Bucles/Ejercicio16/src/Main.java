import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        boolean primo = true;
        System.out.print("Introduce el numero ");
        int num = Integer.parseInt(s.next());

        for (int i = 2; i < num; i++){
            if ((num%i) == 0){
                primo = false;
            } else {
                primo = true;
            }
        }
        System.out.print("El número introducido ");
        if (primo == true){
            System.out.print("es primo.");
        } else {
            System.out.print("no es primo.");
        }
    }
}