
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int odabir = 1;

        while(odabir != 0){
            System.out.println("unesi borj:");
            odabir = scanner.nextInt();
            suma += odabir;

            }
        System.out.println("suma je ="+suma);
        }

    }




