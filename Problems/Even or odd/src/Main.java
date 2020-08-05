import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        do {
            x = sc.nextInt();

            if (x % 2 == 1) {

                System.out.println("odd");
            } else if (x == 0) {
                break;
            } else {

                System.out.println("even");
            }


        } while (x != 0);



    }
}