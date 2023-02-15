public class Mamifero extends Animal {
    private int numMamas;

    public Mamifero(int annoNacimiento, String genero, int numMamas) {
        super(annoNacimiento, genero);
        this.numMamas = numMamas;
    }

    public int getNumMamas() {
        return numMamas;
    }

    public void setNumMamas(int numMamas) {
        this.numMamas = numMamas;
    }

    public void amamantar() {
        System.out.println("Amamantando...");
    }


}

