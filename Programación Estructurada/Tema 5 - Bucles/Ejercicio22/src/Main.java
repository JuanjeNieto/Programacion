

public class Main {
    public static void main(String[] args) {

        boolean primo = false;
        for (int i = 2; i <= 100 ; i++) {
            primo = true;

            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    primo = false;
                }
            }
            if (primo)
            {
                System.out.println(i);
            }
        }

    }
}