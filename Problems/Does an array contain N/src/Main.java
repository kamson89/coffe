import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }


        int number = scanner.nextInt();

        boolean result = false;

        for (int i : array) {
            if (i == number) {

                result = true;
                break;
            }

        }

        System.out.println(result);
    }

}