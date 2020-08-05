import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int max = 0;
       do {
           x = sc.nextInt();
           if (x > max) {
               max = x;

           }
       } while (x != 0);

        System.out.println(max);
    }
}