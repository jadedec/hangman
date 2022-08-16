package hangmanGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordSelector {

    private List<String> words;

    public String selectWord() throws IOException {

        this.words = loadFile();
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

    private List<String> loadFile() throws IOException {
        List<String> words = new ArrayList<>();

        try {
            words = Files.readAllLines(Paths.get("src/word.txt"));
        } catch (IOException e) {
            throw e;
        }
        return words;
    }


    //String[] words = {"cattle", "chicken", "shrimp", "gorilla", "giraffe", "monkey"};


}
