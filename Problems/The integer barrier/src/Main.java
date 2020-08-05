import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int sum = 0;

        do {
            x = sc.nextInt();
            sum = sum + x;

            if (sum >= 1000) {

                break;
            }



        } while (x != 0);


        if (sum >= 1000) {

            System.out.println(sum - 1000);
        } else {

            System.out.println(sum);
        }
    }
}