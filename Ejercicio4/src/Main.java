public class Main {
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(9,9);
        Fraccion f2 = new Fraccion(3,6);

        System.out.println("La fraccion numero uno es " + f1.toString());
        System.out.println("La fraccion numero dos es " + f2.toString());

        System.out.println("La multiplicacion de ambas es " + f1.multiplicar(f2).toString());

        System.out.println("La inversa de la multiplicacion es "+ f1.multiplicar(f2).invertir());

        System.out.println("La division de las fracciones anteriores es" + f1.dividir(f2).toString());

        System.out.println("La simplificacion " + f2.simplificar());

    }
}