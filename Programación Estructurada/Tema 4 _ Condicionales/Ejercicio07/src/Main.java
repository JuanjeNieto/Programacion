import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

        System.out.print("Dime la primera nota");
        double nota1 = Double.parseDouble(s.next());

        if (nota1 < 4) {
            System.out.println("Lo siento, no puedo seguir haciendo la media co esta nota");
        }
        else {
            System.out.print("Dime la segunda nota");
            double nota2 = Double.parseDouble(s.next());

            if (nota2 < 4) {
                System.out.println("Lo siento, no puedo seguir haciendo la media co esta nota");

            }
            else{
                System.out.print("Dime la tercera nota");
                double nota3 = Double.parseDouble(s.next());

                if (nota3 < 4) {
                    System.out.println("Lo siento, no puedo seguir haciendo la media co esta nota");

                }
                else {
                    System.out.println("La media es: " + ((nota1 + nota2 + nota3)/3));
                }
            }
        }
    }
}