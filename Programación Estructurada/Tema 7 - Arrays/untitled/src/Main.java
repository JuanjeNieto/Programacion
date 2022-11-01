import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        System.out.println("Relacion Ejercicio 07 - Arrays");
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
                default:
                    System.out.println("Ejercicio inexistente!");
                    break;
            }
        } while (opcion != 0);
    }
    public static void ejercicio1(){
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        for (int i = 0; i < 12; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void ejercicio2(){
        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for (int i = 0; i < 10; i++) {
            System.out.println(simbolo[i]+" ");
        }
    }

    public static void ejercicio3(){
        Scanner s = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un numero");
            array[i] = s.nextInt();
        }
        System.out.println();

        for (int i = 9; i >= 0; i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void ejercicio4(){

            int[] numero = new int[20];
            int[] cuadrado = new int[20];
            int[] cubo = new int[20];
        System.out.print("Numero ");
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*100)+1;
            System.out.print(numero[i] + " ");
        }
        System.out.println();
        System.out.print("Cuadrado ");
        for (int i = 0; i < 20; i++) {
            cuadrado[i]= numero[i] * numero[i];
            System.out.print(cuadrado[i]+" ");
        }
        System.out.println();
        System.out.print("Cubo ");
        for (int i = 0; i < 20; i++) {
            cubo[i]= numero[i] * numero[i] * numero[i];
            System.out.print(cubo[i]+" ");
        }
    }
    public static void ejercicio5(){
        Scanner scanner = new Scanner((System.in));
        int[] array = new int[10];
        int min = 0;
        int max = 0;
        max=min=array[0];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximo: "+max);
        System.out.println("Mínimo: "+min);
    }

    public static void ejercicio6(){
        Scanner s = new Scanner((System.in));

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un numero");
            numeros[i] = s.nextInt();
        }

        int aux = numeros[numeros.length-1];
        for (int i = (numeros.length-1); i > 0; i++) {
            numeros[i] = numeros[i-1];

        }
        numeros[0] = aux;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }

    }

    public static void ejercicio7(){
        Scanner s = new Scanner(System.in);

        int[] array = new int[100];
        int num1;
        int num2;

        for (int i = 0; i < 100; i++) {
            array[i] = ((int)(Math.random()*20)+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Dime el numero que quieres cambiar: ");
        num1 = s.nextInt();

        System.out.println("Dime el numero por el que lo vas cambiar: ");
        num2 = s.nextInt();

        for (int i = 0; i < 100; i++) {
            if (array[i] == num1) {
                System.out.print("'"+num2+"' ");
            }
            else {
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void ejercicio8(){
        Scanner s = new Scanner((System.in));

        for (int i = 1; i <= 12; i++) {
            System.out.println("Temperatura del mes Nº"+i+":");
            int grados = s.nextInt();
            for (int j = 1; j < grados/2; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void ejercicio9(){

        Scanner s = new Scanner(System.in);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime un numero ");
            array[i] = s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((array[i]%2)==0) {
                System.out.print("Par "+ array[i] +" ");
            }
            else{
                System.out.print("Impar "+ array[i] +" ");
            }
        }
    }
}