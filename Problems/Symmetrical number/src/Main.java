import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        String a = sc.next();

        
        char first = a.charAt(0);
        char second = a.charAt(1);
        char third = a.charAt(2);
        char fourth = a.charAt(3);
        
        if (first == fourth && second == third) {
            
            System.out.println("1");
        } else {
            
            System.out.println("37");
        }
    }
}
