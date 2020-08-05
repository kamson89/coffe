import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfTheBus = scanner.nextInt();
        int numberOfTheBridges = scanner.nextInt();
        //int array[] = new int[numberOfTheBridges];
        int[] bridges = new int[numberOfTheBridges];
        int whichBridge = 0;
        boolean crash = false;



        for (int i = 0; i < numberOfTheBridges; i++) {

            bridges[i] = scanner.nextInt();

        }



            for (int i = 1; i <= numberOfTheBridges; i++) {

            if (heightOfTheBus >= bridges[i - 1]) {
                whichBridge = whichBridge + i;
                crash = true;
                break;

            }

        }
        if (crash) {

            System.out.println("Will crash on bridge " + whichBridge);

        } else {

            System.out.println("Will not crash");
        }
    }
}