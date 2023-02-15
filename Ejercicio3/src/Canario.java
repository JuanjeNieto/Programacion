public class Canario extends Ave {
    String razaCanario;

    public Canario (int annoNacimiento, String genero,  String colorPluma, String razaCanario){
        super(annoNacimiento, genero, colorPluma);
        this.razaCanario = razaCanario;
    }


    public String getRazaCanario() {
        return razaCanario;
    }

    public void setRazaCanario(String razaCanario) {
        this.razaCanario = razaCanario;
    }

    public void cantar(){
        System.out.println("♫♫♫ pio, pio ♫♫♫");
    }

    public void piolin(){
        System.out.println("¡Me parece haber visto a un lindo gatito!");
    }
}
