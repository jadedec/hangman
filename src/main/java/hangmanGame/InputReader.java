package hangmanGame;

import java.util.Scanner;

public class InputReader {

    public String readUserInput() {
        Scanner user = new Scanner(System.in);
        System.out.println("Please input ONE letter:");
        String input = user.nextLine();

        //only get the first letter. no cheating!
        String userInput = input.substring(0, 1);
        return userInput;
    }
}
