public class Main {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 30, 40);
        Tiempo t2 = new Tiempo(0, 35, 20);
        Tiempo t3 = t1.suma(t2);
        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);
        System.out.println("Tiempo 1 + Tiempo 2: " + t3);
        Tiempo t4 = t1.resta(t2);
        System.out.println("Tiempo 1 - Tiempo 2: " + t4);

        int minutosPartido = 97;
        Tiempo horasPartido = new Tiempo(0,0,0);

        horasPartido = horasPartido.minutosAhora(minutosPartido);

        System.out.println("El partido ha durado: "+horasPartido + ", lo que conforma un total de " + minutosPartido + " minutos");
    }
}