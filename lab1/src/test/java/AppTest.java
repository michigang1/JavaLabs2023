import org.junit.jupiter.api.Test;
import src.App;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testGetMoreThanAverage() {
        String[] strings = {"Hello", "World", "Java", "Programming", "Language"};
        String[] result = App.getMoreThanAverage(strings);
        String[] expected = {"Programming", "Language"};
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetLessThanAverage() {
        String[] strings = {"Hello", "World", "Java", "Programming", "Language"};
        String[] result = App.getLessThanAverage(strings);
        String[] expected = {"Hello", "World", "Java"};
        assertArrayEquals(expected, result);
    }

}
