import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, dime un día (1-7)");
        int dia1 = Integer.parseInt(s.next());


        System.out.println("Dime una hora (0-23)");
        int hora1 = Integer.parseInt(s.next());

        System.out.println("Por favor, dime otro día (1-7)");
        int dia2 = Integer.parseInt(s.next());


        System.out.println("Dime otra hora (0-23)");
        int hora2 = Integer.parseInt(s.next());

        int horas = 0;
        int diferencia = 0;
        diferencia = dia2 - dia1;
        boolean datos = true;

        if ((hora1 < 0) || (hora1 > 23)) {
            datos = false;
        }
        if (dia1 == dia2){
            if (hora1 > hora2){
                datos = false;
            } else {
                horas = hora2 - hora1;
            }
        }
        if (dia2 > dia1){
            horas = hora2 - hora1;

            horas = horas + (24*diferencia);

        }
        if (datos){
            System.out.print("Las horas transcurridas son: "+(horas));
        }
        else {
            System.out.print("Los datos introducidos no son validos");
        }
    }
}

