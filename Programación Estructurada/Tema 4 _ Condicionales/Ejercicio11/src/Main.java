import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        int sec;
        int restante = 0;
        System.out.println("Dime la hora (0-24)");
        int hora = Integer.parseInt(s.next());
        System.out.println("Dime los minutos(1-60)");
        int minutos = Integer.parseInt(s.next());

        if (hora == 23) {
            sec = minutos*60;
            restante = 3600 - sec;
        } else if (hora < 23) {
            sec = (hora*3600) + (minutos*60);
            restante = 86400 - sec;
        }
        else{
            System.out.println("Brother, esta hora no existe.");
        }

        System.out.println("Te quedan "+restante+" segundos hasta la media noche");
    }
}