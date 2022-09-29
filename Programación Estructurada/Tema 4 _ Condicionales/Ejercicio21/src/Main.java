import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner((System.in));

        System.out.println("Dime la nota del primer examen");
        double nota1 = Integer.parseInt(s.next());

        System.out.println("Dime la nota del segundo examen");
        double nota2 = Integer.parseInt(s.next());

        double media = (nota1+nota2)/2;

        if (media > 5){
            System.out.println("Tu nota final es: "+media);
        }
        else if (media < 5) {
            System.out.println("cual es el resultado de la recuperación?");
            String recu = s.next();
            if (recu.equals("apto")) {
                media = 5;
                System.out.println("Tu nota final es: "+media);
            }else if (recu.equals("no apto")) {
                System.out.println("Lo siento, tu nota de programacion es"+media);
            }
        }
    }
}