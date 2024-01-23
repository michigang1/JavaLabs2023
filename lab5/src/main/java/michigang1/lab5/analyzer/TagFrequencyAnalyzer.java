package michigang1.lab5.analyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagFrequencyAnalyzer {
    private static final String TAG_REGEX = "<(\\w+)(\\s|>)";

    public void analyze(String url) {
        try {
            Map<String, Integer> tagFrequencyMap = extractTagFrequencies(url);
            displayTagFrequencies(tagFrequencyMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, Integer> extractTagFrequencies(String url) throws IOException {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        Map<String, Integer> tagFrequencyMap = new HashMap<>();
        Pattern tagPattern = Pattern.compile(TAG_REGEX);

        String line;
        while ((line = reader.readLine()) != null) {
            Matcher matcher = tagPattern.matcher(line);
            while (matcher.find()) {
                String tagName = matcher.group(1);
                tagFrequencyMap.put(tagName, tagFrequencyMap.getOrDefault(tagName, 0) + 1);
            }
        }
        reader.close();
        return tagFrequencyMap;
    }

    private void displayTagFrequencies(Map<String, Integer> tagFrequencyMap) {
        Map.Entry<String, Integer>[] entries = tagFrequencyMap.entrySet().toArray(new Map.Entry[0]);

        Arrays.sort(entries, Map.Entry.comparingByKey());
        System.out.println("Tags in lexicographic order");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("<" + entry.getKey() + ">: " + entry.getValue());
        }

        Arrays.sort(entries, Map.Entry.comparingByValue());
        System.out.println("\nTags in ascending order of appearance frequency");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("<" + entry.getKey() + "> : " + entry.getValue());
        }
    }
}