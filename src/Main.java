import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //objects created
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //coin sides
        String heads = "heads";
        String tails = "tails";
        String coinSide;

        //random boolean to simulate coin flip
        boolean isHeads = random.nextBoolean();
        if (isHeads) {
            coinSide = heads;
        } else {
            coinSide = tails;
        }

        //variables defined
        String userChoice;
        boolean isTrue;

        //Welcome message
        System.out.println("\nWelcome to the coin flip game");

        do {
            //user choice
            System.out.println("\nChoose heads or tails");
            userChoice = scanner.nextLine().toLowerCase();
            isTrue = (userChoice.equals(heads) || userChoice.equals(tails));
            if (!isTrue) {
                System.out.println("Wrong, choose again");
            }
        }
        while (!isTrue);

        //message about user choice and roll
        System.out.println("\nYour choice is " + userChoice);
        System.out.println("You roll " + coinSide);

        //message for win or not
        if (userChoice.equals(coinSide)) {
            System.out.println("Great, you won");
        } else {
            System.out.println("Sorry, you lost");
        }

        scanner.close();


    }

}
