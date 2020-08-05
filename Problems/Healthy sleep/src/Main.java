import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (h >= a && h <= b) {

            System.out.println("Normal");
        } else if (h > b) {

            System.out.println("Excess");
        } else if (h < b) {

            System.out.println("Deficiency");
        }
    }
}