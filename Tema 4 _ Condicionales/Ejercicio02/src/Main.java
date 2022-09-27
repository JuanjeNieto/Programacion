import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);

        System.out.printf("Digame la hora, que sea un numero del 1-24\n");
        int hora = Integer.parseInt(s.next());

        if (hora >= 6 && hora <= 12){
            System.out.println("¡Buenos días!");
        } else if (hora >= 13 && hora <=20) {
            System.out.println("¡Buenas tardes!");
        } else if (hora >= 21 && hora <=24) {
            System.out.println("Buenas noches :)");
        } else if (hora >=1 && hora <=5) {
            System.out.println("Buenas noches :)");
        } else{
            System.out.println("LA hora introducida no es valida");
        }

    }
}