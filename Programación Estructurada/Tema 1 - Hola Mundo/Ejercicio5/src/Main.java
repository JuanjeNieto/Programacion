public class Main {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String gris = "\033[37m";
        String blanco = "\033[38m";



        System.out.println(rojo + "Database" + verde + "\tEntornos" + azul +"\tProg." + verde + "\tEntornos" + rojo + "\tDatabase");
        System.out.println(rojo +"Database"+ verde +"\tEntornos"+azul +"\tProg."+azul +"\tProg."+rojo+ "\t\tDatabase");
        System.out.println(morado + "Inglés"+azul +" \t\t Prog."+azul +"\t\tProg."+ azul +"\tProg."+naranja+"\t\tSistemas");
        System.out.println("--------------------------------------------------------");
        System.out.println( blanco + " FOL "+azul+"\t\t Prog."+morado+"\t\tInglés"+azul+"\t\tProg."+naranja+"\t\tSistemas");
        System.out.println(blanco + " FOL"+ gris +"\t\t LMSGI."+naranja +"\t\tSistemas"+naranja+"\tSistemas"+gris+"\tLMSGI");
        System.out.println(blanco + " FOL"+ gris+"\t\t LMSGI."+naranja +"\t\tSistemas"+naranja+"\tSistemas"+gris+"\tLMSGI");

    }
}