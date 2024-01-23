import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Programming", "Language"};
        String[] resultLess = getLessThanAverage(strings);
        String[] resultMore = getMoreThanAverage(strings);
        System.out.println("Less than average: "+ Arrays.toString(resultLess));
        System.out.println("More than average: "+ Arrays.toString(resultMore));
    }

    public static String[] getMoreThanAverage(String[] strings) {
        int averageLength = getAverageLength(strings);
        return Arrays.stream(strings)
                .filter(s -> s.length() > averageLength)
                .toArray(String[]::new);
    }

    public static String[] getLessThanAverage(String[] strings) {
        int averageLength = getAverageLength(strings);
        return Arrays.stream(strings)
                .filter(s -> s.length() < averageLength)
                .toArray(String[]::new);
    }

    private static int getAverageLength(String[] strings) {
        return (int) Arrays.stream(strings)
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }
}
