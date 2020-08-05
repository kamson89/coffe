import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int larger = 0; // 1
        int smaller = 0; // -1
        int perfect = 0; // 0

        for (int i = 0; i < n; i++) {
            switch (sc.nextInt()) {

                case 1:
                    larger++;
                    break;
                case -1:
                    smaller++;
                    break;
                case 0:
                    perfect++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}