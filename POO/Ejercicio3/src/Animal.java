public class Animal {
    private int annoNacimiento;
    private String genero;

    public Animal(int annoNacimiento, String genero) {
        this.annoNacimiento = annoNacimiento;
        this.genero = genero;
    }

    public int getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void setAnnoNacimiento(int annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void respirar() {
        System.out.println("Respirando...");
    }

    public void moverse() {
        System.out.println("Moviéndose...");
    }

    public void comer() {
        System.out.println("Comiendo...");
    }


}

