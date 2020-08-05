import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int gradeA = 0; //5
        int gradeB = 0; //4
        int gradeC = 0; //3
        int gradeD = 0; //2

        for (int i = 0; i < n; i++) {

            int grade = sc.nextInt();

            if (grade == 5) {
                gradeA++;
            } else if (grade == 4) {
                gradeB++;
            } else if (grade == 3) {
                gradeC++;
            } else if (grade == 2) {
                gradeD++;
            }
        }

        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " +
                gradeA);

    }
}