
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Articulo[] arrayArticulos = new Articulo[3];
        

        int posicion = 0;
        int codigo;
        String descripcion = " ";
        double precioCompra;
        double precioVenta;
        int unidadesStock;

        int opcion;


        do {
            System.out.println("\nAlmacén GESTIMAL");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada mercancía");
            System.out.println("6. Salida mercancía");
            System.out.println("7. Salir");
            opcion = s.nextInt();

            switch (opcion){

                case 1:
                    for (int i = 0; i < posicion; i++) {
                        System.out.println(arrayArticulos[i]);
                    }
                    break;
                case 2:
                    if (posicion == 3) {
                        System.out.println("No puedes añadir otro artículo distinto, estamos llenos");
                    }
                    else {
                        System.out.println("\nAlta");
                        System.out.println("================");
                        System.out.print("Código: ");
                        codigo = s.nextInt();
                        if (buscarArticulo(arrayArticulos, codigo) != -1) {
                            System.out.println("Ya existe un artículo con ese código");
                        } else {
                            s.skip("\n");
                            System.out.println("Descripción: ");
                            descripcion = s.nextLine();
                            System.out.println("Precio compra: ");
                            precioCompra = s.nextDouble();
                            System.out.println("Precio venta: ");
                            precioVenta = s.nextDouble();
                            System.out.println("Unidades en stock: ");
                            unidadesStock = s.nextInt();

                            Articulo articulo = new Articulo(codigo, descripcion,
                                    precioCompra, precioVenta, unidadesStock);
                            arrayArticulos[posicion] = articulo;
                            posicion++;
                        }

                    }
                    break;
                case 3:
                    System.out.println("\nBaja");
                    System.out.println("==================");
                    System.out.print("Introduce el código: ");
                    codigo = s.nextInt();
                    System.out.println();

                    int buscar = buscarArticulo(arrayArticulos, codigo);
                    if (buscar == -1) {
                        System.out.println("No existe artículo con este código");

                    }
                    else{
                        for (int i = buscar; i < posicion -1; i++) {
                            arrayArticulos[i] = arrayArticulos[i+1];
                        }
                        arrayArticulos[posicion - 1] = null;
                        posicion--;
                        System.out.println("Articulo eliminado correctamente");

                    }
                    break;
                case 4:
                    System.out.println("\nModificación");
                    System.out.println("=================");

                    System.out.print("Introduce el código del artículo que deseas modificar: ");
                    codigo = s.nextInt();
                    System.out.println();

                    int buscar2 = buscarArticulo(arrayArticulos, codigo);
                    if (buscar2 == -1) {
                        System.out.println("No existe artículo con dicho código");
                    }
                    else{
                        for (int i = 0; i < posicion; i++) {
                            if (arrayArticulos[i].getCodigo() == codigo) {
                                System.out.println("Dime qué quieres modificar");
                                System.out.println("1. Descripción");
                                System.out.println("2. Precio de compra");
                                System.out.println("3. Precio de venta");
                                System.out.println("4. Nada, salir");
                                int opcionMod = s.nextInt();
                                s.skip("\n");
                                switch (opcionMod){
                                    case 1:
                                        System.out.println("Descripción");
                                        System.out.println("Introduce la nueva descripcion");
                                        String newDescripcion = s.nextLine();
                                        arrayArticulos[i].setDescripcion(newDescripcion);
                                        break;
                                    case 2:
                                        System.out.println("Precio Compra");
                                        System.out.println("Introduce el nuevo precio de compra");
                                        double newPrecioCompra = s.nextDouble();
                                        arrayArticulos[i].setPrecioCompra(newPrecioCompra);
                                        break;
                                    case 3:
                                        System.out.println("Precio Venta");
                                        System.out.println("Introduce el nuevo precio de venta");
                                        double newPrecioVenta = s.nextDouble();
                                        arrayArticulos[i].setPrecioCompra(newPrecioVenta);
                                        break;
                                    case 4:
                                        System.out.println("Saliste del menú de modificaciones");
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Entrada de mercancía");
                    System.out.println("====================");

                    System.out.println("Introduce el código del artículo");
                    codigo = s.nextInt();
                    System.out.println();
                    int buscar3 = buscarArticulo(arrayArticulos, codigo);
                    if (buscar3 == -1) {
                        System.out.println("No existe artículo con dicho código");
                    }
                    else {
                        for (int i = 0; i < posicion; i++) {
                            if (arrayArticulos[i].getCodigo() == codigo) {
                                System.out.println("Introduce el número de artículos que entrana stock");
                                int newUnidadesStock = s.nextInt();

                                arrayArticulos[i].setUnidadesStock(arrayArticulos[i].getUnidadesStock()+ newUnidadesStock);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Salida de mercancía");
                    System.out.println("====================");

                    System.out.println("Introduce el código del artículo");
                    codigo = s.nextInt();
                    System.out.println();
                    int buscar4 = buscarArticulo(arrayArticulos, codigo);
                    if (buscar4 == -1) {
                        System.out.println("No existe artículo con dicho código");
                    }
                    else {
                        for (int i = 0; i < posicion; i++) {
                            if (arrayArticulos[i].getCodigo() == codigo) {
                                System.out.println("Introduce e número de artículos que salen stock");
                                int newUnidadesStock = s.nextInt();
                                if (newUnidadesStock > arrayArticulos[i].getUnidadesStock()) {
                                    System.out.println("No puedes sacar más de lo que tienes");
                                }
                                else {
                                    arrayArticulos[i].setUnidadesStock(arrayArticulos[i].getUnidadesStock() - newUnidadesStock );
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Has salido correctamente");

            }




        } while (opcion != 7);

    }
    public static int buscarArticulo(Articulo[] arrayArticulos, int codigo) {
        for (int i = 0; i < arrayArticulos.length; i++) {
            if (arrayArticulos[i] != null && arrayArticulos[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
}