package src;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

//1.	Визначити ті рядки,
//        довжина яких менша (більша) середньої.
//        На вхід поступає масив String. На виході – масив String.
public class App {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Programming", "Language"};
        String[] resultLess = getLessThanAverage(strings);
        String[] resultMore = getMoreThanAverage(strings);
        System.out.println("Less than average: "+ Arrays.toString(resultLess));
        System.out.println("More than average: "+ Arrays.toString(resultMore));
    }

    public static String @NotNull [] getMoreThanAverage(String @NotNull [] strings) {
        ArrayList<String> targetStrings = new ArrayList<>();

        int averageLength = getAverageLength(strings);
        for (String string : strings) {
            if (string.length() > averageLength) {
                targetStrings.add(string);
            }
        }

        return targetStrings.toArray(String[]::new);
    }

    public static String @NotNull [] getLessThanAverage(String @NotNull [] strings) {
        ArrayList<String> targetStrings = new ArrayList<>();

        int averageLength = getAverageLength(strings);
        for (String string : strings) {
            if (string.length() < averageLength) {
                targetStrings.add(string);
            }
        }

        return targetStrings.toArray(String[]::new);
    }

    private static int getAverageLength(String @NotNull [] strings) {
        int averageLength = 0;
        for (String string : strings) {
            averageLength += string.length();
        }
        return averageLength / strings.length;
    }
}
