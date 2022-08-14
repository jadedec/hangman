package hangmanGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultDisplayer {

    public static void currentHint(int chance, String[] correctGuess) {
        System.out.println(chance + " chances left");

        //print out the correct part
        System.out.println("Correct guess: " + Arrays.toString(correctGuess));
    }

    public static boolean displayResult(String input, String[] wordArr, ArrayList<String> playerInputs, String[] correctGuess) {

        if (playerInputs.contains(input)) {
            System.out.println("This is used already.");
            System.out.println();
            return true;
        } else {
            boolean inputCorrect = false;
            for (int i = 0; i < wordArr.length; i++) {
                if (input.equals(wordArr[i])) {
                    correctGuess[i] = input;
                    playerInputs.add(input);
                    inputCorrect = true;
                }
            }

            System.out.println();
            return inputCorrect;
        }
    }

    public static void drawHangman(int chance) {
        if (chance <= 6) {
            System.out.println("   ____________________");
        }
        if (chance <= 5) {
            System.out.println("            __|__");
        }
        if (chance <= 4) {
            System.out.println("           / o o \\");
        }
        if (chance <= 3) {
            System.out.println("           \\__^__//");
        }
        if (chance <= 2) {
            System.out.println("             _|_");
        }
        if (chance <= 1) {
            System.out.println("           // | \\");
        }
        if (chance <= 0) {
            System.out.println("            // \\ ");
            System.out.println("          //     \\");

        }
    }
}
