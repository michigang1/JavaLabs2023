package michigang1.lab6;

import michigang1.lab6.translator.Translator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.addWordPair("hello", "привіт");
        translator.addWordPair("world", "світ");
        // Add more word pairs as needed

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase in English:");
        String phrase = scanner.nextLine();
        String translatedPhrase = translator.translate(phrase);
        System.out.println("Translated phrase in Ukrainian: " + translatedPhrase);
    }
}
