package hangmanGame;

import java.util.Arrays;
import java.util.Random;

public class WordSelector {
    Random random = new Random();

    String[] words = {"cattle", "chicken", "shrimp", "gorilla", "giraffe", "monkey"};

    public String selectWord() {
        return words[random.nextInt(words.length)];
    }


}
