import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.printf("Dame la cantidad en Mb ");
        double Mb = Double.parseDouble(s.next());

        System.out.println("La cantidad en Kb es " + (Mb/1000));

        System.out.printf("Dame la cantidad en Kb ");
        double Kb = Double.parseDouble(s.next());

        System.out.println("La cantidad en Mb es " + (Kb*1000));
    }
}