import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        boolean result1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean result2 = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean result3 = num3 > 0 && num1 <= 0 && num2 <= 0;
    
        boolean result4 = result1 || result2 || result3;
        System.out.println(result4);
        
    }
}
