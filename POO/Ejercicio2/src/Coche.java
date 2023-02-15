class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void anda() {
        System.out.println("Anda con el coche");
        recorre(20);
    }

    public void quemarRueda() {
        System.out.println("burntburnt");
    }
}