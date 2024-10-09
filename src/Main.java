
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int odd_num = 0;
        int even_num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even_num += 1;
            } else {
                odd_num += 1;
            }

        }
        System.out.println("parnih brojva je : " + even_num);
        System.out.println("neparnih brojeva je : " + odd_num);
    }

}