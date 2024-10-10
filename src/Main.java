
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int choice;
        do{
            System.out.println("Pogodi tajni broj u rasponu od 1 do 10: ");
            choice = scanner.nextInt();

        }while(!(choice== 7));

        System.out.println("Točno tjani broj je 7");
    }
}



