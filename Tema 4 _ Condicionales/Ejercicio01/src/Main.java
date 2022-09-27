import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Pon un dia de la semana:\n1. Lunes\n2. Martes\n 3.Miercoles\n4. Jueves\n5. Viernes\n");
        int dia = Integer.parseInt(s.next());

        switch (dia){
            case 1:
                System.out.println("Lunes, toca Bases de Datos");break;
            case 2:
                System.out.println("Martes, toca Entornos");break;
            case 3:
                System.out.println("Miercoles, toca Programación");break;
            case 4:
                System.out.println("Jueves, toca Entornos");break;
            case 5:
                System.out.println("Viernes, toca Bases de Datos");break;
        }

    }
}