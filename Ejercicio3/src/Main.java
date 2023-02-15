
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato[] arrayGatos = new Gato[4];

        for (int i = 0; i < arrayGatos.length; i++) {
            System.out.println("Dime el año de nacimiento de este gato: ");
            int annoNacimiento = s.nextInt();

            System.out.println("Dime el genero de este gato: ");
            String genero = s.next();

            System.out.println("Si es hembra, indique el numero de mamas. Si no, ponga 0 por favor: ");
            int numMamas = s.nextInt();

            System.out.println("Dime la raza del gato: ");
            String raza = s.next();

            System.out.println("Inserte el número de vidas de este gato: ");
            int numVidas = s.nextInt();

            arrayGatos[i] = new Gato(annoNacimiento, genero, numMamas, raza, numVidas);
        }

        for (Gato gato : arrayGatos){
            System.out.println(gato);
        }

    }
}