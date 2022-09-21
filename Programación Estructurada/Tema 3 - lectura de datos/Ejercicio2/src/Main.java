import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);

        System.out.printf("Introduce el precio en euros: ");
        double euros = Double.parseDouble(s.next());

        int pesetas = (int) (euros * 166.386);
        System.out.println(euros + " euros son " + pesetas + " ptas");
    }
}