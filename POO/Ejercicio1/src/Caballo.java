public class Caballo {
    ///// Metodos

    void llamarcaballo(){
        System.out.println(this.raza+ " " + this.colorDePelo+ " " + this.chip + " "+ this.edad);
    }
    void salta(){
        System.out.println("*pega un salto*");
    }
    // getter
    public String getRaza() {
        return raza;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public String getChip() {
        return chip;
    }

    public int getEdad() {
        return edad;
    }

    // setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //atributes
    private String raza, colorDePelo, chip;
    private int edad;

    //constructor
    public Caballo(String raza, String colorDePelo, String chip, int edad){
        this.raza = raza;
        this.colorDePelo = colorDePelo;
        this.chip = chip;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Caballo{" +
                "raza='" + raza + '\'' +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", chip='" + chip + '\'' +
                ", edad=" + edad +
                '}';
    }
}
