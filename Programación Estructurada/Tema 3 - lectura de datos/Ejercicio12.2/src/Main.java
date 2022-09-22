import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Cual es la base imponible: ");
        double base = Double.parseDouble(s.next());

        System.out.print("Indique el tipo de promoción: \nPulse 1 para nopro\n2 para mitad\n3 para meno5\n4 para 5porc\n");
        int codigo = Integer.parseInt(s.next());

        switch (codigo){
            case 1:
                 break;
            case 2:
                base/=2;
                break;
            case 3:
               base-=5;
               break;
            case 4:
                base*=0.05;
                break;
            default:
                System.out.println("No existe esta opción");
                break;


        }
        System.out.printf("IVA: ");
        double iva = Double.parseDouble(s.next());

       if (iva == 21 || iva == 10 || iva ==4) {
           if (iva == 21) {
               System.out.println("Resultado: " + base * 1.21);
           } else if (iva == 10) {
               System.out.println("Resultado: " + base * 1.10);
           } else {
               System.out.println("Resultado: " + base * 1.04);
           }
       }
       else {
           System.out.println("El IVA no es correcto.");
       }
    }
}