import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String horos;
        System.out.println("Dime el mes en que naciste(1-12): ");
        int mes = Integer.parseInt(s.next());

        System.out.println("Ahora dime el dia: ");
        int dia = Integer.parseInt(s.next());

        switch (mes){
            case 1:
                if (dia > 20) {
                    horos = "Acuario";
                }
                else{ horos = "Capricornio"; }
                break;
            case 2:
                if (dia > 19) {
                    horos = "Piscis";
                } else {
                    horos = "Acuario";
                }
                break;
            case 3:
                if(dia > 20 ){
                horos = "Aries";
                }
                else{
                    horos = "Piscis";
                    }break;
            case 4:
                if (dia > 19) {
                    horos = "Tauro";
                }
                else {
                    horos = "Aries";
            } break;
            case 5:
                if (dia > 20) {
                    horos = "Géminis";
                }
                else {
                    horos = "Taruo";
                } break;
            case 6:
                if (dia > 20 ) {
                    horos = "Cancer";
                }
                else {
                    horos = "Géminis";
                }break;
            case 7:
                if (dia > 22) {
                    horos = "Leo";
                }
                else{
                    horos = "Cancer";
                }

                // Continuar mañana
        }
    }
}