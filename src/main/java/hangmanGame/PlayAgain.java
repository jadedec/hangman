package hangmanGame;

import java.util.Scanner;

public class PlayAgain {
    public static boolean wannaPlay() {

        Scanner letterInput = new Scanner(System.in);

        System.out.println("Do you want to play again? (y/n)");
        String letter = letterInput.nextLine().toLowerCase();

        if (letter.equals("y")) {
            return true;
        } else {
            return false;
        }

    }
}
