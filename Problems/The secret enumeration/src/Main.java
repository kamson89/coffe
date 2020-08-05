public class Main {

    public static void main(String[] args) {

        int counter = 0;


        for (Secret name : Secret.values()) {

            if (name.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}



/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START,
} */
