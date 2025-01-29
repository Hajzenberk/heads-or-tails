import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();


        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("\nHeads");
        } else {
            System.out.println("\nTails");
        }

    }

}
