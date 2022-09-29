import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime con qué caracter quieres rellenar la pirámide: ");
        String caracter = s.next() ;
        System.out.println("Dime cómo quieres la pirámide:\n1. Hacia arriba\n2. Hacia abajo\n3. Hacia la izquierda\n4. Hacia la derecha");
        int lado = Integer.parseInt(s.next());

        switch (lado){
            case 1:
                System.out.println("  "+caracter);
                System.out.println(" "+caracter+caracter+caracter);
                System.out.println(caracter+caracter+caracter+caracter+caracter);
            break;
            case 2:
                System.out.println(caracter+caracter+caracter+caracter+caracter);
                System.out.println(" "+caracter+caracter+caracter);
                System.out.println("  "+caracter);
                break;
            case 3:
                System.out.println("    "+caracter);
                System.out.println("  "+caracter+" "+caracter);
                System.out.println(caracter+" "+caracter+" "+caracter);
                System.out.println("  "+caracter+" "+caracter);
                System.out.println("    "+caracter);
            break;
            case 4:
                System.out.println(caracter);
                System.out.println(caracter+" "+caracter);
                System.out.println(caracter+" "+caracter+" "+caracter);
                System.out.println(caracter+" "+caracter);
                System.out.println(caracter);
                break;
            default:
                System.out.println("No es una elección válida.");
                break;
        }

    }
}