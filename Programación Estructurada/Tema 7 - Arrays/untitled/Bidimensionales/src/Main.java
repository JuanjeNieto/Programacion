
import java.util.Random;
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
                default:
                    System.out.println("Ejercicio inexistente!");
                    break;
            }
        } while (opcion != 0);
    }

    public static void ejercicio1() {
        int[][] num = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.printf("%9d  ", num[i][j]);

            }
            System.out.println();
        }
    }

    public static void ejercicio2() {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Numero de la posición: " + i + "," + j + ": ");
                matriz[i][j] = s.nextInt();
            }
        }
        System.out.println();
        int sumaFila;

        for (i = 0; i < 4; i++) {
            sumaFila = 0;
            for (j = 0; j < 5; j++) {
                System.out.printf("%7d  ", matriz[i][j]);
                sumaFila += matriz[i][j];
            }

            System.out.printf("|%6d  ", sumaFila);
            System.out.println();

        }


        int sumaColumna;
        int sumaTotal = 0;
        for (j = 0; j < 5; j++) {
            sumaColumna = 0;
            for (i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            sumaTotal += sumaColumna;

            System.out.printf("%7d  ", sumaColumna);
        }

        System.out.printf("|%6d  ", sumaTotal);
        System.out.println();
    }

    public static void ejercicio3() {
        int[][] matriz = new int[4][5];
        Random r = new Random();
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j] = r.nextInt(900) + 100;
            }
        }
        System.out.println();
        int sumaFila;

        for (i = 0; i < 4; i++) {
            sumaFila = 0;
            for (j = 0; j < 5; j++) {
                System.out.printf("%7d  ", matriz[i][j]);
                sumaFila += matriz[i][j];
            }

            System.out.printf("|%6d  ", sumaFila);
            System.out.println();
        }


        int sumaColumna;
        int sumaTotal = 0;
        for (j = 0; j < 5; j++) {
            sumaColumna = 0;
            for (i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            sumaTotal += sumaColumna;

            System.out.printf("%7d  ", sumaColumna);
        }

        System.out.printf("|%6d  ", sumaTotal);
        System.out.println();
    }

    public static void ejercicio4() {
        // Se que es con Thread.sleep pero no me va no se por que
        System.out.println("No funcionan los threads, asi que este ejercicio es igual que el anterior");
    }

    public static void ejercicio5() {
        int[][] arrayBi = new int[6][10];
        Random r = new Random();
        int min = arrayBi[0][0];
        int max = arrayBi[0][0];
        int minFila = 0, minColumna = 0;
        int maxFila = 0, maxColumna = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                arrayBi[i][j] = r.nextInt(1000) + 1;
                System.out.printf("%8d ", arrayBi[i][j]);


                if (arrayBi[i][j] > max) {
                    max = arrayBi[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
                if (arrayBi[i][j] < min) {
                    min = arrayBi[i][j];
                    minFila = i;
                    minColumna = j;
                }
            }
            System.out.println();
        }

        System.out.println("El maximo es " + max + " y su posicion es " + maxFila + "," + maxColumna);
        System.out.println("El minimo es " + min + " y su posicion es " + minFila + "," + minColumna);
    }

    public static void ejercicio6() {
        int[][] arrayBi = new int[6][10];
        Random r = new Random();

        boolean repeated;
        int k;
        int l;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                do {
                    arrayBi[i][j] = r.nextInt(1000) + 1;

                    repeated = false;
                    for (k = 0; k < 10 * i + j; k++) {
                        if (arrayBi[i][j] == arrayBi[k / 10][k % 10]) {
                            repeated = true;
                        }
                    }
                } while (repeated);
            }
        }


        int min = arrayBi[0][0];
        int max = arrayBi[0][0];
        int minFila = 0, minColumna = 0;
        int maxFila = 0, maxColumna = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                arrayBi[i][j] = r.nextInt(1000) + 1;
                System.out.printf("%8d ", arrayBi[i][j]);


                if (arrayBi[i][j] > max) {
                    max = arrayBi[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
                if (arrayBi[i][j] < min) {
                    min = arrayBi[i][j];
                    minFila = i;
                    minColumna = j;
                }
            }
            System.out.println();
        }

        System.out.println("El maximo es " + max + " y su posicion es " + maxFila + "," + maxColumna);
        System.out.println("El minimo es " + min + " y su posicion es " + minFila + "," + minColumna);
    }

    public static void ejercicio7() {
        Scanner s = new Scanner(System.in);
        // se definen constantes para representar el
        // contenido de las celdas
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x;
        int y;
        int[][] cuadrante = new int[5][4];
        // inicializa el array
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
        // coloca la mina
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        cuadrante[minaX][minaY] = MINA;
        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;
        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
            // pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO)
                        System.out.print("X ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println(" ----------\n0 1 2 3 4\n");
            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = s.nextInt();
            System.out.print("Coordenada y: ");
            y = s.nextInt();
            // mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    break;
                default:
            }
            }
            while (!salir) ;
            // pinta el cuadrante

            for (y = 3; y >= 0; y--) {
                System.out.print(y + " ");
                for (x = 0; x < 5; x++) {
                    switch (cuadrante[x][y]) {
                        case VACIO:
                            c = " ";
                            break;
                        case MINA:
                            c = "* ";
                            break;
                        case TESORO:
                            c = "€ ";
                            break;
                        case INTENTO:
                            c = "x ";
                            break;
                        default:
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");

        }

    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);

        int fila, columna;

        String[][] a = new String[8][8];

        // Tablero
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = "█";
            }
        }

        // MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "    ");
            }
            System.out.println("");
        }

        // PREGUNTAR
        System.out.println("Introduzca la posicion del alfil, por ejemplo b2: ");
        String posicion = sc.next();
        fila = (int)(posicion.charAt(0)) - 96;
        columna = (int)(posicion.charAt(1)) - 48;

        fila = fila - 1;
        columna = columna - 1;

        //SUSTITUIR
        a[fila][columna] = "♗";

        //MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //DIAGONALES

        //Importante poner i = 1 y i < ) para que no se coma el alfil
        for (int i = 1; i < 9; i++) {

            if (fila+i < 8 && columna+i <8) {
                a[fila+i][columna+i] = "*";
            }

            if (fila-i >= 0 && columna-i >= 0) {
                a[fila-i][columna-i]="*";
            }

            if (fila+i < 8 && columna-i >= 0) {
                a[fila+i][columna-i] = "*";
            }

            if (fila-i >= 0 && columna+i <8) {
                a[fila-i][columna+i] = "*";
            }

        }

        //MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}



