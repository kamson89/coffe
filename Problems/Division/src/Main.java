import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {

         double a1 = a;
         double b1 = b;

         return a1 / b1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}
