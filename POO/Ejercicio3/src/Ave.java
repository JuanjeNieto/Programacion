public class Ave extends Animal{
    private String colorPluma;

    public Ave(int annoNacimiento, String genero, String colorPluma) {
        super(annoNacimiento, genero);
        this.colorPluma = colorPluma;
    }

    public String getColorPluma() {
        return colorPluma;
    }

    public void setColorPluma(String colorPluma) {
        this.colorPluma = colorPluma;
    }

    public void volar() {
        System.out.println("Volando...");
    }
}
