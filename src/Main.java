import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesi prvi cjeli broj: ");
        Integer number1 = scanner.nextInt();
        System.out.println("unesi drugi cijeli broj: ");
        Integer number2 = scanner.nextInt();

        var suma = number2 + number1;
        var mul = number2 * number1;
        System.out.println("Zbroj=" + suma);
        System.out.println("Umnožak=" + mul);

        }
    }
