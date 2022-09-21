import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Nota que sacaste en el primer examen: ");
        double nota1 = Double.parseDouble(s.next());

        System.out.printf("¿Qué nota quieres sacar en la evaluación? ");
        double notaEv = Double.parseDouble(s.next());

        nota1 = nota1 *0.4;



        System.out.println("Para tener un "+notaEv+" en la evaluación, necesitas sacar un " + ((notaEv)-nota1)/0.6);

    }
}