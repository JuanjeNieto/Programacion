import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int passwd;

        int i = 4;

        boolean correcto = false;

        do {
            System.out.println("Dime la contraseña: ");
            passwd = Integer.parseInt(s.next());
            if(passwd == 1234){
                    correcto = true;
            }
            else {
                System.out.println("Es incorrecto");
            }
            i--;
        } while ((i>0)&&(!correcto));

        if (correcto) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");

        }

        else{
            System.out.println("Lo siento, ya no tienes más oportunidades");
        }
    }
}