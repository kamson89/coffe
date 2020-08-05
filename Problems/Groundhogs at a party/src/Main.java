import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int howManyCups = sc.nextInt();
        boolean weekend = sc.nextBoolean();
         boolean result = true;

         if (howManyCups >= 10 && howManyCups <= 20 && weekend == false ) {

             result = true;
             System.out.println(result);
         } else if (howManyCups >= 15 && howManyCups <= 25 && weekend == true) {

             result = true;
             System.out.println(result);
         } else {

             result = false;
             System.out.println(result);
         }

    }
}