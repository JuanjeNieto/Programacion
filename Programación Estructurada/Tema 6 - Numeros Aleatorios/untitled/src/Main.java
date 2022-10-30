
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        System.out.println("Relacion Ejercicio 06 - Bucles");
        do {
            System.out.println("Dime un ejercicio (0 para salir): ");
            Scanner s = new Scanner(System.in);
            opcion = s.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                default:
                    System.out.println("Ejercicio inexistente!");
                    break;
            }
        } while (opcion != 0);
    }

    public static void ejercicio1() {
        int count = 0;

        for (int i = 1; i <= 3; i++) {
            double r = (Math.random() * 6 + 1);

            System.out.print((int) r + " ");
            count += r;

        }
        System.out.println();
        System.out.println(count);
        System.out.println();
    }

    public static void ejercicio2() {
        System.out.println("Muestra una carta al azar:");
        int carta = (int) (Math.random() * 13) + 1; // genera un número aleatorio

        switch (carta) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
                break;

        }
        int palo = (int) (Math.random() * 4) + 1;

        switch (palo) {
            case 1:
                System.out.print(" de Pica");
                break;
            case 2:
                System.out.print(" de Trébol");
                break;
            case 3:
                System.out.print(" de Corazones");
                break;
            case 4:
                System.out.print(" de Diamantes");
                break;
        }
        System.out.println();


    }

    public static void ejercicio3() {
        System.out.println("Muestra una carta española al azar:");
        int carta = (int) (Math.random() * 10) + 1; // genera un número aleatorio

        switch (carta) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("Sota");
                break;
            case 9:
                System.out.print("Caballo");
                break;
            case 10:
                System.out.print("Rey");
                break;

            default:
                break;

        }
        int palo = (int) (Math.random() * 4) + 1;

        switch (palo) {
            case 1:
                System.out.print(" de Basto");
                break;
            case 2:
                System.out.print(" de Oro");
                break;
            case 3:
                System.out.print(" de Copa");
                break;
            case 4:
                System.out.print(" de Espada");
                break;
        }
        System.out.println();
    }

    public static void ejercicio4() {
        for (int i = 1; i <= 20; i++) {
            System.out.print((int) (Math.random() * 10 + 1) + " ");
        }
    }

    public static void ejercicio5() {

        int suma = 0;
        int max = 0;
        int min = 199;

        for (int i = 1; i <= 50; i++) {
            double r = (Math.random() * 100) + 100;

            System.out.print((int) r + " ");

            if (r > max) {
                max = (int) r;
            } else if (r < min) {
                min = (int) r;
            }
            suma += r;

        }
        System.out.println();
        System.out.println("El minimo es = " + min);
        System.out.println("El maximo es = " + max);
        System.out.println("La media es " + (suma / 50));
        System.out.println();
    }

    public static void ejercicio6() {
        Scanner s = new Scanner(System.in);

        double r = (int)((Math.random() * 101));
        int cont = 4;
        int numerointroducido = 0;
        int i = 0;

        while (i <= cont && numerointroducido != r) {
            System.out.println("Dime un número");
            numerointroducido = Integer.parseInt(s.next());

            if (numerointroducido == r) {
                System.out.println("ENHORABUENAAA");
            } else {
                if (numerointroducido < r) {
                    System.out.println("Intenta con uno más grande");
                }
                if (numerointroducido > r) {
                    System.out.println("Intenta uno más pequeño");
                }
                System.out.println("Te quedan " + cont + " intentos");

                cont--;
            }
        }
        System.out.println("El numero era "+r);
    }

    public static void ejercicio7() {
        Scanner s = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("QUINIELA JORNADA 10 LA LIGA SANTANDER");
        String valorApuesta = "";

        for (int i = 1; i <= 3; i++) {
            System.out.println("-------");
            System.out.println("Columna Nª"+i);
            System.out.println();
            for (int j = 1; j <= 14; j++) {
                int apuesta = (int)(Math.random()*3);
                switch (apuesta){
                    case 0:
                        valorApuesta = "X";
                        break;
                    case 1:
                        valorApuesta = "1";
                        break;
                    case 2:
                        valorApuesta = "2";
                        break;
                    default:
                        break;

                }
                System.out.println("Apuesta Nª"+(100+j)+"\t" + valorApuesta);
                System.out.println();
            }

        }


    }
    public static void ejercicio8(){

        Scanner s = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("QUINIELA JORNADA 10 LA LIGA SANTANDER");
        String valorApuesta = "";

        for (int i = 1; i <= 3; i++) {
            System.out.println("-------");
            System.out.println("Columna Nª"+i);
            System.out.println();
            for (int j = 1; j <= 14; j++) {
                //Como dice el ejercicio, lo hacemos con divisores de 6
                //3/6 para el 1
                //2/6 para el 2
                //1/6 para el X
                int apuesta = (int)(Math.random()*6);
                switch (apuesta){
                    case 0:
                        valorApuesta = "1";
                        break;
                    case 1:
                        valorApuesta = "1";
                        break;
                    case 2:
                        valorApuesta = "1";
                        break;
                    case 3:
                        valorApuesta = "2";
                        break;
                    case 4:
                        valorApuesta = "2";
                        break;
                    case 5:
                        valorApuesta = "X";
                    default:
                        break;

                }
                System.out.println("Apuesta Nª"+(100+j)+"\t" + valorApuesta);
                System.out.println();
            }

        }
    }
    public static void ejercicio9(){

        int r = 0;
        int count = 0;
        while(r != 24){
            r = (int)(Math.random() * 101);
            if ((r%2) == 0) {
                System.out.println(r);
                count++;
            }
        }
        System.out.println("Se han generado "+count+" numeros");


    }
    public static void ejercicio10(){
        for (int i = 0; i < 10; i++) {
            int nVeces = ((int)(Math.random()*43));
            for (int j = 0; j < nVeces; j++) {
                String caracterMostrado = "";
                int caracterRandom = (int)(Math.random()*6);
                switch(caracterRandom){
                    case 0: caracterMostrado = "*"; break;
                    case 1: caracterMostrado = "."; break;
                    case 2: caracterMostrado = "-"; break;
                    case 3: caracterMostrado = "="; break;
                    case 4: caracterMostrado = "|"; break;
                    case 5: caracterMostrado = "@"; break;

                    default: break;
                }
                System.out.print( caracterMostrado + " ");
            }
            System.out.println();
        }

    }

    public static void ejercicio11(){
        String nota = "";
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 0; i < 20; i++) {


            int r = (int) (Math.random() * 5);

            switch (r) {
                case 0:
                    nota = "Suspenso";
                    suspenso++;
                    break;
                case 1:
                    nota = "Suficiente";
                    suficiente++;
                    break;
                case 2:
                    nota = "Bien";
                    bien++;
                    break;
                case 3:
                    nota = "Notable";
                    notable++;
                    break;
                case 4:
                    nota = "Sobresaliente";
                    sobresaliente++;
                    break;

            }
            System.out.println(nota);
        }
        System.out.println("Hay " + suspenso + " suspensos");
        System.out.println("Hay " + suficiente + " sufis");
        System.out.println("Hay " + bien + " bienes");
        System.out.println("Hay " + notable + " notables");
        System.out.println("Hay " + sobresaliente + " sobres");
    }

    public static void ejercicio12(){

        for (int i = 1; i < 1000000; i++) {
            char r = (char)((Math.random()*127)+32);
            System.out.print(r);
        }
    }
    public static void ejercicio13(){

       boolean igual = false;

        while (!igual){

            int dado1 = ((int)(Math.random()*6)+1);
            int dado2 = ((int)(Math.random()*6)+1);
            System.out.println();

            System.out.println(dado1);
            System.out.println(dado2);

            if (dado2 == dado1) {
                igual = true;
            }

        }
        System.out.println();
    }
    public static void ejercicio14(){
        Scanner s = new Scanner(System.in);

        System.out.println("Piensa un número entre 0 y 100");
        int numeroIntroducido = 0;
        int i = 1;
        int min = 0;
        int max = 100;
        boolean acierto = false;

        while((i <= 5) && (!acierto)){
            int r = (int)(Math.random()*(max-min+1))+min;
            System.out.println("Es este? = "+r);
            System.out.println("Sí (0)" +"\tEs mayor (1)"+"\tEs menor(2)");
            int opcion = 0;
            opcion = Integer.parseInt(s.next());

            switch(opcion){
                case 0:
                    acierto = true;
                    System.out.println("Pan comido!");
                    break;
                case 1:
                    min = r+1;
                    break;
                case 2:
                    max = r-1;
                    break;
                default:
                    System.out.println("Error");
                    i--;
                    break;
            }
                i++;

        }
        if (!acierto){
            System.out.println("Me has ganado...");
        }
    }

    public static void ejercicio15(){
          int compas = 2;

        while (compas %2 == 0){
            compas = (int)((Math.random()*28)+4);
        };

        String primera = "";

        for (int i = 0; i < compas; i++){

            for (int j = 0; j < 4; j++){

                int notaRandom = (int)(Math.random()*7);
                String nota = "";
                switch (notaRandom){
                    case 0:
                        nota = "do";
                        break;
                    case 1:
                        nota = "re";
                        break;
                    case 2:
                        nota = "mi";
                        break;
                    case 3:
                        nota = "fa";
                        break;
                    case 4:
                        nota = "sol";
                        break;
                    case 5:
                        nota = "la";
                        break;
                    case 6:
                        nota = "si";
                        break;
                }
                if ((i == 0) && (j == 0)){
                    primera = nota;
                }
                if ((i == compas-1) && (j == 3)){
                    nota = primera;
                }
                System.out.print(nota + " ");
            }
            System.out.print("|");
        }
        System.out.println("|");

    }

    public static void ejercicio16(){
         for (int i = 0; i < 3; i++) {
            String figSalida = "";
            int r = (int)(Math.random()*5);
            switch(r){
                case 0: figSalida = "Diamante"; break;
                case 1: figSalida = "Corazon"; break;
                case 2: figSalida = "campana"; break;
                case 3: figSalida = "herradura"; break;
                case 4: figSalida = "limon"; break;
            }
            System.out.print(figSalida+" ");
        }
        System.out.println();
    }
}