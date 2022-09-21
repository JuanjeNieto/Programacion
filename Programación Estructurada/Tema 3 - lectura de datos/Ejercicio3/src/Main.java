import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Introduce el precio en pesetas: ");
        double pesetas = Double.parseDouble(s.next());

        double euros = pesetas / 166.386;
        System.out.println(pesetas + " pesetas son " + euros + " ptas");
    }
}