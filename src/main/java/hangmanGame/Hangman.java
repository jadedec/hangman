package hangmanGame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static hangmanGame.ResultDisplayer.*;


public class Hangman {


    protected int chance = 7;

    public void GameStart() {
        //get a word
        try {
            String word = new WordSelector().selectWord();
            String[] wordArr = word.split("");
            //store all the inputs
            ArrayList<String> playerInputs = new ArrayList<>();

            //store the correct inputs, at beginning fill it with "_"
            String[] correctGuess = new String[word.length()];
            Arrays.fill(correctGuess, "_ ");

            //check get the random word
            System.out.println(word);

            System.out.println();
            System.out.println();
            System.out.println("-------NEW GAME-------");
            System.out.println("Welcome to hangman");
            System.out.println("You have 7 chances");
            System.out.println("Please input ONE letter at one time");
            System.out.println("GAME START");
            System.out.println("");

            while (true) {
                currentHint(chance, correctGuess);

                String input = new InputReader().readUserInput();

                if (displayResult(input, wordArr, playerInputs, correctGuess)) {
                    System.out.println("YES, keep going");
                }
                if (!displayResult(input, wordArr, playerInputs, correctGuess)) {
                    System.out.println("NO, keep trying");
                    chance--;
                    drawHangman(chance);
                }


                if (Arrays.equals(correctGuess, wordArr)) {
                    System.out.println("YOU WIN!");
                    chance = 7;
                    System.out.println("             ____");
                    System.out.println("            /o o \\");
                    System.out.println("            \\_︶_/");
                    System.out.println("             _|_");
                    System.out.println("            / | \\");
                    System.out.println("             / \\ ");
                    System.out.println("           /     \\");
                    break;
                }

                if (chance == 0) {
                    System.out.println("GAME OVER");
                    System.out.println("The answer is " + word);
                    break;
                }


            }

        } catch (IOException e) {
            System.out.println("cannot find a word");

        }


    }

}
