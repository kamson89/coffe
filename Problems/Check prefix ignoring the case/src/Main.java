import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        boolean result = false;

        if (word.charAt(0) == 'J' || word.charAt(0) == 'j') {

            result = true;
        }
        System.out.println(result);
    }
}