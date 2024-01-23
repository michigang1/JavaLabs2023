package michigang1.lab5.finder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxWordsLineFinder {
   private String maxWordsLine = "";
    public String getFromPath(String path) {
        int maxWordsCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                if (words.length > maxWordsCount) {
                    maxWordsCount = words.length;
                    maxWordsLine = line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return maxWordsLine;
    }
}