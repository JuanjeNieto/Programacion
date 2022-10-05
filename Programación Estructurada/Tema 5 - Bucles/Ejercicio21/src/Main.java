import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        double n;

        //impares para la media y  mayor de los pares

        double mayor = 0;

        double impar = 0;

        double dividendo = 0;

        // inicializamos contador para numeros e impares.

        int cont = 0;
        int contadorImpar = 0;


        do{
            System.out.println("Introduce un número");
            n = Integer.parseInt(s.next());
            if (n%2 == 0) {
                if (n > mayor){

                    mayor = n;

                }

            }
            else {

                impar = n;
                dividendo+=n;
                contadorImpar++;

            }
            cont++;
        }while(n > 0);
        double media = (dividendo-impar)/(contadorImpar-1);
        System.out.println("Ha introducido "+(cont-1)+" nums");
        System.out.println("La media de los impares es: "+media);
        System.out.println("El mayor número par es: "+mayor);
    }
}