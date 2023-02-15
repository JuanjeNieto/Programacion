import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bicicleta miBicicleta = new Bicicleta(21);
        Coche miCoche = new Coche(4);

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    miBicicleta.anda();
                    break;
                case 2:
                    miBicicleta.hacerCaballito();
                    break;
                case 3:
                    miCoche.anda();
                    break;
                case 4:
                    miCoche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + miBicicleta.kilometrosRecorridos);
                    break;
                case 6:
                    System.out.println("Kilometraje del coche: " + miCoche.kilometrosRecorridos);
                    break;
                case 7:
                    System.out.println("Kilometraje total: " + Vehiculo.kilometrosTotales);
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        }
    }
}