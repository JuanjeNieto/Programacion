import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles en la zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Entradas disponibles en la zona de compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Entradas disponibles en la zona VIP: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("¿Para qué zona deseas las entradas? (1: Principal, 2: Compra-Venta, 3: VIP): ");
                    int zona = entrada.nextInt();
                    System.out.print("¿Cuántas entradas deseas?: ");
                    int entradas = entrada.nextInt();

                    switch (zona) {
                        case 1:
                            principal.vender(entradas);
                            break;
                        case 2:
                            compraVenta.vender(entradas);
                            break;
                        case 3:
                            vip.vender(entradas);
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}