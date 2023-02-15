public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(Pizza.TipoPizza.MARGARITA, Pizza.TamanoPizza.PEQUEÑA);
        Pizza p2 = new Pizza(Pizza.TipoPizza.FUNGHI, Pizza.TamanoPizza.FAMILIAR);
        p2.sirve();
        Pizza p3 = new Pizza(Pizza.TipoPizza.CUATRO_QUESOS, Pizza.TamanoPizza.MEDIANA);
        p3.sirve();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}