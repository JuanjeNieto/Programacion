public class Lagarto extends Animal {

    public static String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    static String tipoEscamas;
    public Lagarto(int annoNacimiento, String genero, String tipoEscamas) {
        super(annoNacimiento, genero);
        tipoEscamas = this.tipoEscamas;
    }

}

