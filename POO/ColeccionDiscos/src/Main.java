import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disco[] coleccion = new Disco[3];
        int posicion = 0;
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;
        int opcion;
        String entrada;

        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");

            System.out.println("1. Nuevo disco");
            System.out.println("2. Borrar disco");
            System.out.println("3. Listado");
            System.out.println("0. Salir");
            System.out.print("Introduzca una opción: ");
            entrada = sc.nextLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    if (posicion == 3) {
                        System.out.println("La colección está llena. Borre algún disco para añadir nuevos.");
                    } else {
                        System.out.println("\nNuevo disco");
                        System.out.println("===========");
                        System.out.print("Código: ");
                        codigo = sc.nextLine();
                        if (buscarDisco(coleccion, codigo) != -1) {
                            System.out.println("Ya existe un disco con ese código.");
                        } else {
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Título: ");
                            titulo = sc.nextLine();
                            System.out.print("Género: ");
                            genero = sc.nextLine();
                            System.out.print("Duración: ");
                            entrada = sc.nextLine();
                            duracion = Integer.parseInt(entrada);

                            Disco disco = new Disco(codigo, titulo, autor, genero, duracion);
                            coleccion[posicion] = disco;
                            posicion++;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nBorrar disco");
                    System.out.println("=============");
                    System.out.print("Introduzca el código del disco que desea borrar: ");
                    codigo = sc.nextLine();
                    int indice = buscarDisco(coleccion, codigo);
                    if (indice == -1) {
                        System.out.println("No existe ningún disco con ese código.");
                    } else {
                        for (int i = indice; i < posicion - 1; i++) {
                            coleccion[i] = coleccion[i + 1];
                        }
                        coleccion[posicion - 1] = null;
                        posicion--;
                        System.out.println("Disco borrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nListado");
                    System.out.println("=======");

                    System.out.println("1. Listado completo");
                    System.out.println("2. Listado por autor");
                    System.out.println("3. Listado por género");
                    System.out.println("4. Listado por duración");
                    System.out.print("Introduzca una opción: ");
                    entrada = sc.nextLine();
                    opcion = Integer.parseInt(entrada);

                    switch (opcion) {
                        case 1:
                            for (int i = 0; i < posicion; i++) {
                                System.out.println(coleccion[i]);
                            }
                            break;

                        case 2:
                            System.out.print("Introduzca el nombre del autor: ");
                            autor = sc.nextLine();
                            for (int i = 0; i < posicion; i++) {
                                if (coleccion[i].getAutor().equals(autor)) {
                                    System.out.println(coleccion[i]);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Introduzca el género: ");
                            genero = sc.nextLine();
                            for (int i = 0; i < posicion; i++) {
                                if (coleccion[i].getGenero().equals(genero)) {
                                    System.out.println(coleccion[i]);
                                }
                            }
                            break;

                        case 4:
                            System.out.print("Introduzca la duración mínima en minutos: ");
                            entrada = sc.nextLine();
                            int duracionMinima = Integer.parseInt(entrada);
                            System.out.print("Introduzca la duración máxima en minutos: ");
                            entrada = sc.nextLine();
                            int duracionMaxima = Integer.parseInt(entrada);
                            for (int i = 0; i < posicion; i++) {
                                if (coleccion[i].getTiempo() >= duracionMinima && coleccion[i].getTiempo() <= duracionMaxima) {
                                    System.out.println(coleccion[i]);
                                }
                            }
                            break;

                        default:
                            System.out.println("La opción seleccionada no es válida.");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("\n¡Hasta luego!");
                    break;

                default:
                    System.out.println("\nLa opción seleccionada no es válida.");
                    break;
            }
        } while (opcion != 0);
    }

    public static int buscarDisco(Disco[] coleccion, String codigo) {
        for (int i = 0; i < coleccion.length; i++) {
            if (coleccion[i] != null && coleccion[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }
}

