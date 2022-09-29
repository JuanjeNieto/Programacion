import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String diasemana = s.next();

        int dianum = 0;

        switch(diasemana) {
            case "lunes":
                dianum = 0;
                break;
            case "martes":
                dianum = 1;
                break;
            case "miércoles":
                dianum = 2;
                break;
            case "jueves":
                dianum = 3;
                break;
            case "viernes":
                dianum = 4;
                break;
            default:
                System.out.print("Este dia no es valido en este programa.");
        }

        System.out.println("A continuación introduzca la hora (hora y minutos)");

        System.out.print("Hora: ");
        int horas = Integer.parseInt(s.next());

        System.out.print("Minutos: ");
        int min = Integer.parseInt(s.next());

        int minTotal = (4*24*60)+(15*60);
        int minActual = (dianum*24*60)+(horas*60)+min;

        System.out.print("Faltan "+(minTotal-minActual)+" min para el fin de semana");
    }
}