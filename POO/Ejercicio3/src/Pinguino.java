public class Pinguino extends Ave {

    public Pinguino(int annoNacimiento, String genero, String colorPluma) {
        super(annoNacimiento, genero, colorPluma);
    }

    public void bailar(){
        System.out.println("*Está bailando...*");
    }

    public void nadar(){
        System.out.println("Se acaba de tirar al mar...");
    }


}


