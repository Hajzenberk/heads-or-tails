import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        //Random boolean for value true or false
        boolean isHeads = random.nextBoolean();

        System.out.println("\nChoose heads or tails");
        String userChoice = scanner.nextLine();
        System.out.println("Your choice is " + userChoice);

        //if statement to print the message for the user
        if (isHeads) {
            System.out.println("\nHeads");
        } else {
            System.out.println("\nTails");
        }

        scanner.close();

    }

}
