import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 1;
        int wynik = 1;

       while (wynik <= n) {

            wynik = x * x;
            if (wynik > n) {
                break;
            }
            System.out.println(wynik);
           x++;
        }

    }
}
