package michigang1.lab6.translator;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    private HashMap<String, String> dictionary;

    public Translator() {
        dictionary = new HashMap<>();
    }

    public void addWordPair(String english, String ukrainian) {
        dictionary.put(english.toLowerCase(), ukrainian);
    }

    public String translate(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");
        StringBuilder translatedPhrase = new StringBuilder();
        for (String word : words) {
            String translatedWord = dictionary.get(word);
            if (translatedWord != null) {
                translatedPhrase.append(translatedWord);
            } else {
                translatedPhrase.append(word);
            }
            translatedPhrase.append(" ");
        }
        return translatedPhrase.toString().trim();
    }
}