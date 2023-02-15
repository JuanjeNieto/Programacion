public class Perro extends Mamifero {

    String raza;
    int numChip;

    public Perro (int annoNacimiento, String genero, int numMamas, String raza, int numChip){
        super(annoNacimiento, genero, numMamas);
        this.raza = raza;
        this.numChip = numChip;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getnumChip() {
        return numChip;
    }

    public void setNumChip(int numChip) {
        this.numChip = numChip;
    }
    public void ladrar(){
        System.out.println("Guaw supongo");
    }
    public void girar(){
        System.out.println("...empieza a girar, persiguiendo su hueso de juguete...");
    }
}
