
import java.util.Scanner;

public class Gato extends Mamifero{

    private String raza;
    int numVidas;

    public Gato(int annoNacimiento, String genero, int numMamas, String raza, int numVidas) {
        super(annoNacimiento, genero, numMamas);
        this.raza = raza;
        this.numVidas = numVidas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getNumVidas() {
        return numVidas;
    }

    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    public void maullar() {
        System.out.println("...");
    }

    public void llamar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dile algo al gato: ");
        System.out.println("\t1. Pssst Psssst");
        System.out.println("\t2. Eh tu gato, VEN AQUI!");
        int option = s.nextInt();
        switch (option){
            case 1:
                System.out.println("*se acerca...*");
                break;
            case 2:
                System.out.println("*se va corriendo...*");
                break;
            default: break;
        }

    }

    @Override
    public String toString() {
        return getClass().getName() + " " + getAnnoNacimiento()+ " " + getGenero()+ " " + getRaza() +" "+ numVidas+" " + getNumMamas();
    }
}
