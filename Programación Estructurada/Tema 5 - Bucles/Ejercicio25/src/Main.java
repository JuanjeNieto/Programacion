import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Dame un numero y te daremos el inverso:");
        int n = Integer.parseInt(s.next());

        int vuelta = 0;

        while (n > 0){

            vuelta = (vuelta*10) + (n%10);

            n /= 10;

        }
        System.out.println(vuelta);
    }
}