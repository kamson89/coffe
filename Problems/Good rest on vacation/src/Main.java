import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodDaily = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();

        int sum;

        sum = days * foodDaily + (days - 1) * hotel + flight * 2;

        System.out.println(sum);


    }
}