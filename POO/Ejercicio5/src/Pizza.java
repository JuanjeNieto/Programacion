public class Pizza {

    public enum TipoPizza {
        MARGARITA, CUATRO_QUESOS, FUNGHI
    }
    public enum TamanoPizza {
        PEQUEÑA, MEDIANA, FAMILIAR
    }
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private final TipoPizza tipo;
    private final TamanoPizza tamano;
    private boolean servida;

    public Pizza(TipoPizza tipo, TamanoPizza tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.servida = false;
        totalPedidas++;
    }

    public void sirve() {
        if (!servida) {
            servida = true;
            totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido!");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() {
        return "Pizza " + tipo + " " + tamano + ", servida: " + servida;
    }
}
