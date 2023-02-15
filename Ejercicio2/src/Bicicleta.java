class Bicicleta extends Vehiculo {
    int numeroMarchas;

    public Bicicleta(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void anda() {
        System.out.println("Anda con la bicicleta");
        recorre(10);
    }

    public void hacerCaballito() {
        System.out.println("Haz el caballito con la bicicleta");
    }
}