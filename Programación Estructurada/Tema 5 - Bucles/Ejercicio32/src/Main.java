import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("introduixi un numero positiu polfavol");
        long num = Long.parseLong(s.next());

        // Se le da la vuelta para comprobar
        long numBasura = num;
        long reves = 0;
        int numDig = 0;
        while (numBasura > 0){
            reves = ((reves*10) + (numBasura % 10));
            numBasura /=10;
            numDig++;
        }
        // Calcula los pares y la suma y los muestra
        long dig;
        long suma = 0;
        for (int i = 0; i < numDig ; i++){
            dig = reves%10;
            if (dig%2 == 0){
                suma += dig;
            }
            reves /= 10;
        }
        System.out.print("La suma de los dígitos pares, es: "+suma);
    }
}
