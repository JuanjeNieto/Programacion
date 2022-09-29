import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número de 5 cifras como máximo");
        int num = Integer.parseInt(s.next());
    int cont1=0;
    int cont2=0;
        String numCadena = Integer.toString(num);
        for (int i = 0; i < numCadena.length()-1; i++) {
            if (i == i+1 ) {
              cont1++;
            }
            for (int j = numCadena.length(); j < 0; j--) {
                if (j == j-1) {
                    cont2++;
                }
            }
        }
        if (cont1 == cont2) {
            System.out.println("Es un numero capicua");
        }else{
            System.out.println("NO es capicua");
        }

    }
}