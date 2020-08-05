import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int liczba = 0;

        for (int i = a; i <= b; i++) {

            if (a % 3 == 0) {
                sum = sum + a;
                liczba++;
            }

            a++;

        }
        double suma = sum;
        double liczba1 = liczba;

        System.out.println(suma / liczba1);
    }
}