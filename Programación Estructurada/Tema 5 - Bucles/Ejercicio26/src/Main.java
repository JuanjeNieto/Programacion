import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Dame un número");
        int num = Integer.parseInt(s.next());

        System.out.println("Dame un dígito");
        int digito = Integer.parseInt(s.next());

        // Se copia el numero introducido y se le multiplica y añade un 1
       long numero = num;
       numero = numero * 10 +1;

       // se le da la vuelta y se calcula la posicion

        long vuelta = 0;
        int pos = 1;
        int longitud = 0;

        if (numero == 0){
            longitud = 1;
        }
        while (numero > 0){
            vuelta = (vuelta * 10) + (numero % 10);

            numero /= 10;

            ++longitud;

        }

        // se comprueba la posicion

        while (vuelta!=1){
            if ((vuelta%10) == digito) {
                System.out.print(pos+ " " );
            }
            vuelta /= 10;
            pos++;
        }

        System.out.println();
    }
}